package com.natwest.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "account1")
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;

    @Column(name = "name")
    private String accountHolderName;
    private double balance;
    private String accountType;


    public Account() {

    }


    public Account(int accountId, String accountHolderName, double balance, String accountType) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }


}


