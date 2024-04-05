package com.natwest.service;

import java.util.List;
import com.natwest.entity.Account;
import com.natwest.entity.Transaction;
import com.natwest.repository.TransactionHistory;
import com.natwest.repository.UserDetailsRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TransactionManagementImplTest {



    @InjectMocks
    TransactionManagementImpl transactionManagement;

    @Mock
    Account account;

    @Mock
    UserDetailsRepo userDetailsRepo;

    @Mock
    TransactionHistory transactionHistory;

    @Mock
    Transaction transaction;

    private MockitoAnnotations MokitoAnnotations;

    @BeforeEach
    public void setUp() {
        MokitoAnnotations.openMocks(this);

    }


    @Test
    void getTransactionById() {

        when(transactionHistory.findById("123")).thenReturn(Optional.ofNullable(transaction));
        assertEquals(Optional.ofNullable(transaction),transactionManagement.getTransactionById("123"));
        assertEquals(Optional.ofNullable(transaction).hashCode(),transactionManagement.getTransactionById("123").hashCode());


    }

    @Test
    void getAllTransactions() {
        List<Transaction> transactionList = new ArrayList<>();

        when(userDetailsRepo.findByEmailId("vaishnavihemane786@gmail.com")).thenReturn(account);
        when(transactionHistory.findByAccount(account)).thenReturn(transactionList);
        assertEquals(transactionList,transactionManagement.getAllTransactions("vaishnavihemane786@gmail.com"));
        assertEquals(transactionList.size(),transactionManagement.getAllTransactions("vaishnavihemane786@gmail.com").size());

    }



}