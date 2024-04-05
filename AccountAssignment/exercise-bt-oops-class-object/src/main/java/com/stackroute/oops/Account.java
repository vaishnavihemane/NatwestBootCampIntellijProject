package com.stackroute.oops;

/*
   This class is used to store account details
 */
public class Account {

    private int accountNo;
    private double balance;
    private String status;
    private static int counter;

    public Account(double balance, String status) {
        this.balance = balance;
        this.status = status;
        this.accountNo = ++counter;
    }

    public boolean depositAmount(double amount) {
        if(getStatus().equals("active") && amount > 0){
            balance = getBalance() + amount;
            return true;
        }
        else{
            return false;
        }

    }

    public String getAccountDetails() {

        return "[Account No : "+getAccountNo()+", Status : "+getStatus()+", Balance : "+getBalance()+"]";

    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }






}