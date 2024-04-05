package com.natwest.exception;

public class OTPTimeExpiredException extends Exception{
    private String msg;
    public OTPTimeExpiredException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
