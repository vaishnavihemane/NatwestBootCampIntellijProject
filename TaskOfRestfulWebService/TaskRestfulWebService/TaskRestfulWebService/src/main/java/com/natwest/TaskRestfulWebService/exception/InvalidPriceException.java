package com.natwest.TaskRestfulWebService.exception;

public class InvalidPriceException extends RuntimeException{

    private String msg;

    public InvalidPriceException(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}
