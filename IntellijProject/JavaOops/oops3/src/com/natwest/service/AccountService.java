package com.natwest.service;

import com.natwest.model.Account;

public interface AccountService {


    int withdraw(int amount, Account account);
    int deposit(int amount, Account account);



}
