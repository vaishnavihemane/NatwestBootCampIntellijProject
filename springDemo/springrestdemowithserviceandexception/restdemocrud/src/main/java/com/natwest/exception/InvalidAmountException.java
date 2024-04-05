package com.natwest.exception;

public class InvalidAmountException extends Exception{

    String msg;

    public InvalidAmountException(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMsg(){
        return  msg;
    }

}
