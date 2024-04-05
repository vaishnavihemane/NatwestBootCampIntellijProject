package com.natwest.service;


import com.natwest.entity.Account;
import com.natwest.entity.Transaction;
import com.natwest.repository.TransactionHistory;
import com.natwest.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionManagementImpl implements TransactionManagement{

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    @Autowired
    private TransactionHistory transactionHistory;

    @Override
    public Optional<Transaction> getTransactionById(String transactionId) {
        return transactionHistory.findById(transactionId);
    }

    @Override
    public List<Transaction> getAllTransactions(String userEmailId) {
        Account userAccount = userDetailsRepo.findByEmailId(userEmailId);
        return transactionHistory.findByAccount(userAccount);
    }

}
