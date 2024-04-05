package com.natwest.exception;

public class IdNotFoundException extends RuntimeException{

   private String msg;
    public IdNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }


}
