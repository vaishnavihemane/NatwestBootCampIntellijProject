package com.natwest.service;

import com.natwest.entity.Account;
import com.natwest.exception.InvalidAmountException;
import com.natwest.repository.AccountRepository;
import com.natwest.utility.AppConstant;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AccountServiceImplTest {

    @InjectMocks
    AccountServiceImpl accountService;

    @Mock
    Account account;

    @Mock
    AccountRepository accountRepository;
    private MockitoAnnotations MokitoAnnotations;


    @BeforeEach
    public void setUp(){
        MokitoAnnotations.openMocks(this);
    }




    @Test
    public void addAccountTest() throws InvalidAmountException {

        when(accountRepository.save(account)).thenReturn(account);
        assertEquals(accountService.addAccount(account),account);
        assertEquals(accountService.hashCode(),accountService.addAccount(account).hashCode());
        InvalidAmountException exception = assertThrows(InvalidAmountException.class, () -> accountService.addAccount(account));
        assertEquals(AppConstant.INVALID_AMOUNT_MESSAGE, exception.getMsg());



    }




    @Test
    public void getAllAccountsTest() {

        List<Account> accountList = List.of(new Account(1, "John Doe", 1000.0, "Savings"),
                new Account(2, "Jane Smith", 2000.0, "Checking"),
                new Account(3, "Alice Johnson", 5000.0, "Investment"),
                new Account(4, "Bob Brown", 3000.0, "Savings"));

        when(accountRepository.findAll()).thenReturn(accountList);
        assertEquals(4, accountService.getAllAccounts().size());

    }








}