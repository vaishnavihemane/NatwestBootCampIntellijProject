package com.natwest.exception;

public class InvalidPasswordException extends Exception{


    private String msg;
    public InvalidPasswordException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
