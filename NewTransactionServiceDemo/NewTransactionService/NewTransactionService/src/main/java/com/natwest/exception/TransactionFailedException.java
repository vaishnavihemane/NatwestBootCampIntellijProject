package com.natwest.exception;

public class TransactionFailedException extends Exception{

    private String msg;
    public TransactionFailedException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
