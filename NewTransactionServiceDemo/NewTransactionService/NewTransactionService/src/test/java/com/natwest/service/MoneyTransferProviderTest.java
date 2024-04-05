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
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MoneyTransferProviderTest {



    @InjectMocks
    MoneyTransferProvider moneyTransferProvider;

    @Mock
    Account account;

    @Mock
    UserDetailsRepo userDetailsRepo;

    @Mock
    TransactionHistory transactionHistory;

    @Mock
    AccountInfoByType accountInfoByType;

    @Mock
    OTPValidation otpValidation;

    @Mock
    ValidationOfTransaction validationOfTransaction;

    @Mock
    MakePayment makePayment;


    private MockitoAnnotations MokitoAnnotations;


    private Account sourceAccount ;
    private Account targetAccount ;
    @BeforeEach
    public void setUp() {
        MokitoAnnotations.openMocks(this);

        List<Transaction> list1 = new ArrayList<>();
        sourceAccount = new Account();
        sourceAccount.setRegistrationKey(1234);
        sourceAccount.setEmailId("vaishnavihemane786@gmail.com");
        sourceAccount.setName("Vaishnavi Hemane");
        sourceAccount.setAccountNo("1234567890");
        sourceAccount.setMobileNo("9730246096");
        sourceAccount.setBalance(BigDecimal.valueOf(1500.00));
        sourceAccount.setCurrency("INR");
        sourceAccount.setTransactions(list1);
       // moneyTransferProvider.registerUser(sourceAccount);


        List<Transaction> list2 = new ArrayList<>();
        targetAccount = new Account();
        targetAccount.setRegistrationKey(1238);
        targetAccount.setEmailId("priyankadhomane22@gmail.com");
        targetAccount.setName("Priyanka Dhomane");
        targetAccount.setAccountNo("4563127896");
        targetAccount.setMobileNo("7351899236");
        targetAccount.setBalance(BigDecimal.valueOf(2000.00));
        targetAccount.setCurrency("INR");
        targetAccount.setTransactions(list2);
      //  moneyTransferProvider.registerUser(targetAccount);



    }


    @Test
    void transferMoneyTestWhenTransactionIsSuccessful() throws OTPTimeExpiredException, MissedAllAttemptOfOTPValidation, InsufficientBalanceException, MissedAllAttemptOfOTPValidation, TransactionLimitOfMoneyExceedException, TransactionFailedException {

        when(userDetailsRepo.findByEmailId("vaishnavihemane786@gmail.com")).thenReturn(sourceAccount);
        when(accountInfoByType.getAccountInfoByType("accountNo", "4563127896")).thenReturn(targetAccount);
        Account sourceAccount1 = userDetailsRepo.findByEmailId("vaishnavihemane786@gmail.com");
        Account targetAccount1 = accountInfoByType.getAccountInfoByType("accountNo", "4563127896");

        assertEquals(sourceAccount, sourceAccount1);
        assertNotNull(sourceAccount1);
        assertEquals(targetAccount, targetAccount1);
        assertNotNull(targetAccount1);
        assertEquals(sourceAccount.hashCode(), sourceAccount1.hashCode());
        assertEquals(targetAccount.hashCode(), targetAccount1.hashCode());

        when(otpValidation.validateOtp()).thenReturn(true);
        when(validationOfTransaction.checkTransactionIsValid("vaishnavihemane786@gmail.com", BigDecimal.valueOf(100))).thenReturn(true);
        when(makePayment.payment(sourceAccount, targetAccount, BigDecimal.valueOf(100))).thenReturn(true);
        Transaction s = moneyTransferProvider.transferMoney("vaishnavihemane786@gmail.com", "accountNo", "4563127896", BigDecimal.valueOf(100));
        assertNotNull(s);
        assertEquals(s.getAccount(), sourceAccount1);
        assertNotNull(targetAccount1.getTransactions());

    }



    @Test
    void transferMoneyTestWhenOTPValidationIsFail() throws OTPTimeExpiredException {

        when(otpValidation.validateOtp()).thenReturn(false);
        MissedAllAttemptOfOTPValidation exception1 = assertThrows(MissedAllAttemptOfOTPValidation.class, () -> moneyTransferProvider.transferMoney("vaishnavihemane786@gmail.com","accountNo","4563127896",BigDecimal.valueOf(100)));
        assertEquals(exception1.getMsg(),AppConstant.MISSED_ALL_ATTEMPT_FOR_OTP);

    }


    @Test
    void transferMoneyTestWhenOTPTimeExpiredException() throws OTPTimeExpiredException {

        when(otpValidation.validateOtp()).thenThrow(new OTPTimeExpiredException("Your OTP Time Is Expired, Try after 10 min. !!"));
        OTPTimeExpiredException exception = assertThrows(OTPTimeExpiredException.class,() -> otpValidation.validateOtp());
        assertEquals(exception.getMsg(),AppConstant.OTP_EXPIRED_EXCEPTION);

    }


    @Test
    void transferMoneyTestWhenTransactionLimitOfMoneyExceedException() throws OTPTimeExpiredException, TransactionLimitOfMoneyExceedException {
        when(otpValidation.validateOtp()).thenReturn(true);
        when(validationOfTransaction.checkTransactionIsValid("vaishnavihemane786@gmail.com",BigDecimal.valueOf(100))).thenThrow(new TransactionLimitOfMoneyExceedException("Transaction Limit Of Money For Today Is Exceeded, Only Upto 30000Rs Transaction Is Allowed In A Single Day, Try Tommorrow"));
        TransactionLimitOfMoneyExceedException exception2 = assertThrows(TransactionLimitOfMoneyExceedException.class,() -> moneyTransferProvider.transferMoney("vaishnavihemane786@gmail.com","accountNo","4563127896",BigDecimal.valueOf(100)));
        assertEquals(exception2.getMsg(),AppConstant.TRANSACTION_LIMIT_OF_MONEY_FOR_TODAY_EXCEEDED_MESSAGE);

    }

    @Test
    void transferMoneyTestWhenPaymentMethodThrowInsufficientBalanceException() throws OTPTimeExpiredException, TransactionLimitOfMoneyExceedException, InsufficientBalanceException {
        when(otpValidation.validateOtp()).thenReturn(true);
        when(validationOfTransaction.checkTransactionIsValid("vaishnavihemane786@gmail.com",BigDecimal.valueOf(100))).thenReturn(true);
        when(makePayment.payment(sourceAccount,targetAccount, BigDecimal.valueOf(100))).thenThrow(new InsufficientBalanceException("Sorry, Balance is not sufficient for withdrawl operation !!"));
        InsufficientBalanceException exception3 = assertThrows(InsufficientBalanceException.class,() -> makePayment.payment(sourceAccount,targetAccount, BigDecimal.valueOf(100)));
        assertEquals(exception3.getMsg(),AppConstant.INSUFFICIENT_BALANCE_EXCEPTION);

    }

    @Test
    void transferMoneyTestWhenPaymentMethodReturnFalse() throws OTPTimeExpiredException, TransactionLimitOfMoneyExceedException, InsufficientBalanceException {

        when(otpValidation.validateOtp()).thenReturn(true);
        when(validationOfTransaction.checkTransactionIsValid("vaishnavihemane786@gmail.com",BigDecimal.valueOf(100))).thenReturn(true);
        when(makePayment.payment(sourceAccount,targetAccount, BigDecimal.valueOf(100))).thenReturn(false);
        TransactionFailedException exception4 = assertThrows(TransactionFailedException.class,() -> moneyTransferProvider.transferMoney("vaishnavihemane786@gmail.com","accountNo","4563127896",BigDecimal.valueOf(100)));
        assertEquals(exception4.getMsg(),AppConstant.TRANSACTION_FAILED_MESSAGE);

    }


    @AfterEach
    void tearDown(){
        sourceAccount = null;
        targetAccount = null;
    }






    @Test
    void registerUser() {
    }

    @Test
    void getAllAccounts() {
    }


}