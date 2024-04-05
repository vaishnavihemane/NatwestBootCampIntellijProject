package com.natwest.exception;

public class InvalidUserNameException extends Exception{


    private String msg;
    public InvalidUserNameException (String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
