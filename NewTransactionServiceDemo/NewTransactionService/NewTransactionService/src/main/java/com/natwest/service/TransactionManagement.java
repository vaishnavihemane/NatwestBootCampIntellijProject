package com.natwest.service;

import com.natwest.entity.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionManagement {

    public Optional<Transaction> getTransactionById(String transactionId);
    public List<Transaction> getAllTransactions(String userEmailId);

}
