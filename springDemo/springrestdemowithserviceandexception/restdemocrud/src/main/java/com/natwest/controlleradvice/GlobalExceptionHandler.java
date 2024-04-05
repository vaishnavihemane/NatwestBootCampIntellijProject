package com.natwest.controlleradvice;

import com.natwest.exception.IdNotFoundException;
import com.natwest.exception.InvalidAmountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(InvalidAmountException.class)
    public ResponseEntity<ErrorInfo> handleExceptionBalance(InvalidAmountException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IdNotFoundException.class)
    public String handleExceptionId(IdNotFoundException exception){
        return exception.getMsg();
    }

}
