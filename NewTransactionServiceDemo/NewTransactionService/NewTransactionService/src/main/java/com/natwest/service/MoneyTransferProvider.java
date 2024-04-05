package com.natwest.service;

import com.natwest.TransactionPerformation.MakePayment;
import com.natwest.authentication.AccountInfoByType;
import com.natwest.authentication.OTPValidation;
import com.natwest.entity.Account;
import com.natwest.entity.Transaction;
import com.natwest.exception.*;
import com.natwest.repository.TransactionHistory;
import com.natwest.repository.UserDetailsRepo;
import com.natwest.transactionValidation.ValidationOfTransaction;
import com.natwest.utility.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class MoneyTransferProvider implements OnlineBanking{

        @Autowired
        private UserDetailsRepo userDetailsRepo;

        @Autowired
        private TransactionHistory transactionHistory;

        @Autowired
        private AccountInfoByType accountInfoByType;

        @Autowired
        private OTPValidation otpValidation;

        @Autowired
        private MakePayment makePayment;


        @Autowired
        private ValidationOfTransaction validationOfTransaction;

        @Override
        public Transaction transferMoney(String sourceUserEmailId, String transferTypeForPayment, String targetUserTransferId, BigDecimal transferAmount) throws OTPTimeExpiredException, MissedAllAttemptOfOTPValidation, InsufficientBalanceException, TransactionLimitOfMoneyExceedException, TransactionFailedException {

            Transaction sourceAccountTransaction = null;
            Transaction targetAccountTransaction = null;

            Account sourceAccount = userDetailsRepo.findByEmailId(sourceUserEmailId);
            Account targetAccount = accountInfoByType.getAccountInfoByType(transferTypeForPayment,targetUserTransferId);

            boolean sourUserAuthenticateByOTP;


            sourUserAuthenticateByOTP =  otpValidation.validateOtp();

            if (!sourUserAuthenticateByOTP) {
                throw new MissedAllAttemptOfOTPValidation(AppConstant.MISSED_ALL_ATTEMPT_FOR_OTP);
            }

            validationOfTransaction.checkTransactionIsValid(sourceUserEmailId,transferAmount);

            boolean paymentSuccessful = makePayment.payment(sourceAccount,targetAccount, transferAmount);

            if(paymentSuccessful)
            {
                Random random = new Random();

                sourceAccountTransaction = new Transaction("" + random.nextInt(1000,10000), LocalDateTime.now(),"Debit",transferAmount,"Successful",sourceAccount.getBalance(),sourceAccount.getCurrency(),0.5,sourceAccount);
                transactionHistory.save(sourceAccountTransaction);
                targetAccountTransaction = new Transaction("" + random.nextInt(1000,10000), LocalDateTime.now(),"Credit",transferAmount,"Successful",targetAccount.getBalance(),targetAccount.getCurrency(),0.0,targetAccount);
                transactionHistory.save(targetAccountTransaction);
            }
            else
            {
                throw new TransactionFailedException(AppConstant.TRANSACTION_FAILED_MESSAGE);
            }

            return sourceAccountTransaction;
        }




    @Override
    public Account registerUser(Account userAccount) {
        return userDetailsRepo.save(userAccount);
    }

    @Override
    public List<Account> getAllAccounts() {
        return userDetailsRepo.findAll();
    }





}
