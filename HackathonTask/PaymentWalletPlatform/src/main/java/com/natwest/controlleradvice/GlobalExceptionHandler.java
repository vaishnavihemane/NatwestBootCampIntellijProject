package com.natwest.controlleradvice;

import com.natwest.exception.InvalidEmailIdException;
import com.natwest.exception.InvalidMobileNumberException;
import com.natwest.exception.InvalidPasswordException;
import com.natwest.exception.InvalidUserNameException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(InvalidEmailIdException.class)
    public ResponseEntity<ErrorInfo> handleExceptionForEmailId(InvalidEmailIdException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(InvalidMobileNumberException.class)
    public ResponseEntity<ErrorInfo> handleExceptionForMobileNumber(InvalidMobileNumberException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<ErrorInfo> handleExceptionForPassword(InvalidPasswordException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidUserNameException.class)
    public ResponseEntity<ErrorInfo> handleExceptionForUserName(InvalidUserNameException exception){

        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
        errorInfo.setErrorMessage(exception.getMsg());
        errorInfo.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }







}
