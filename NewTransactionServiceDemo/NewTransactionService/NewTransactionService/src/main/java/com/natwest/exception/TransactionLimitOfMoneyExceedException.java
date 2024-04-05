package com.natwest.exception;

public class TransactionLimitOfMoneyExceedException extends Exception{


    private String msg;
    public TransactionLimitOfMoneyExceedException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
