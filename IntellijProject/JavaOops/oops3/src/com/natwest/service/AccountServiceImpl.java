package com.natwest.service;

import com.natwest.model.Account;

public class AccountServiceImpl implements AccountService{


    @Override
    public int withdraw(int amount, Account account) {

        if(account.getBalance() >= amount){
            account.setBalance(account.getBalance()-amount);
        }
        return account.getBalance();
    }

    @Override
    public int deposit(int amount, Account account) {

        account.setBalance(account.getBalance()+amount);
        return account.getBalance();
    }

}
