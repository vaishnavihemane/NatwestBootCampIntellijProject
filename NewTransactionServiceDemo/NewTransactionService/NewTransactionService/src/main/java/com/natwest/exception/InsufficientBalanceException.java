package com.natwest.exception;

public class InsufficientBalanceException extends Exception{


    private String msg;
    public InsufficientBalanceException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
