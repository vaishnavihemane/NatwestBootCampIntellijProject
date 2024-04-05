package com.natwest.exception;

public class InvalidEmailIdException extends Exception{


    private String msg;
    public InvalidEmailIdException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
