package com.natwest.model;

public class Account {

    private int accountNo;
    private int balance;
    private String accountType;

    public Account(int accountNo, int balance, String accountType) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountNo() {
        return accountNo;
    }


    public int getBalance() {
        return balance;
    }



    public String getAccountType() {
        return accountType;
    }


    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
