package com.natwest.exception;

public class InvalidMobileNumberException extends Exception{


    private String msg;
    public InvalidMobileNumberException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
