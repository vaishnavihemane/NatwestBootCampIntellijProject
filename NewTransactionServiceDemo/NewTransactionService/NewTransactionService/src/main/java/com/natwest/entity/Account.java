package com.natwest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="account")
public class Account {


    @Id
    @Column(name="registrationKey")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int registrationKey;

    private String emailId;
    private String name;
    private String accountNo;
    private String mobileNo;
    private BigDecimal balance;
    private String currency;


    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions = new ArrayList<>();

    public Account(){

    }

    public Account(int registrationKey, String emailId, String name, String accountNo, String mobileNo, BigDecimal balance, String currency, List<Transaction> transactions) {
        this.registrationKey = registrationKey;
        this.emailId = emailId;
        this.name = name;
        this.accountNo = accountNo;
        this.mobileNo = mobileNo;
        this.balance = balance;
        this.currency = currency;
        this.transactions = transactions;
    }

    public int getRegistrationKey() {
        return registrationKey;
    }

    public void setRegistrationKey(int registrationKey) {
        this.registrationKey = registrationKey;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
