package com.natwest.controlleradvice;

import com.natwest.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<ErrorInfo> handleExceptionIfBalanceIsInsufficient(InsufficientBalanceException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.NOT_ACCEPTABLE);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }




    @ExceptionHandler(MissedAllAttemptOfOTPValidation.class)
    public ResponseEntity<ErrorInfo> handleExceptionIfUserMissedAllAttempt(MissedAllAttemptOfOTPValidation exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.SERVICE_UNAVAILABLE);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(OTPTimeExpiredException.class)
    public ResponseEntity<ErrorInfo> handleExceptionIfOtpIsExpired(OTPTimeExpiredException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.REQUEST_TIMEOUT);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TransactionFailedException.class)
    public ResponseEntity<ErrorInfo> handleExceptionIfTransactionFailed(TransactionFailedException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.REQUEST_TIMEOUT);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(TransactionLimitOfMoneyExceedException.class)
    public ResponseEntity<ErrorInfo> handleExceptionIfTransactionLimitOfMoneyExceed(TransactionLimitOfMoneyExceedException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }




}
