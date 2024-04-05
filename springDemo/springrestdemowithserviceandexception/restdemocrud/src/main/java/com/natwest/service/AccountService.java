package com.natwest.service;

import com.natwest.dto.AccountDto;
import com.natwest.entity.Account;
import com.natwest.exception.InvalidAmountException;
import org.springframework.stereotype.Service;

import java.util.List;



public interface AccountService {

    public Account addAccount(Account account) throws InvalidAmountException;
    public List<Account> getAllAccounts();
    public Account getAccountById(int id);
    public String deletedById(int id);
    public List<Account> getAccountsByAccountType(String name);

    public Account updateAccount(int id, Account account);


    public AccountDto getAccountById2(int id);


}
