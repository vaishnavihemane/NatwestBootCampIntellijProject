package com.natwest.TaskRestfulWebService.exception;

public class InvalidIdException extends RuntimeException{

    private String msg;

    public InvalidIdException(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
