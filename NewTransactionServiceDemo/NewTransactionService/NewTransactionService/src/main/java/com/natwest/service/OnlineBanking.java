package com.natwest.service;

import com.natwest.entity.Account;
import com.natwest.entity.Transaction;
import com.natwest.exception.*;

import java.math.BigDecimal;
import java.util.List;

public interface OnlineBanking {

    public Transaction transferMoney(String sourceUserEmailId, String transferTypeForPayment, String targetUserTransferId, BigDecimal transferAmount) throws OTPTimeExpiredException, MissedAllAttemptOfOTPValidation, InsufficientBalanceException, TransactionLimitOfMoneyExceedException, TransactionFailedException;
    public Account registerUser(Account userAccount);
    public List<Account> getAllAccounts();

}
