package com.natwest.exception;

public class MissedAllAttemptOfOTPValidation extends Exception {

    private String msg;
    public MissedAllAttemptOfOTPValidation(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
