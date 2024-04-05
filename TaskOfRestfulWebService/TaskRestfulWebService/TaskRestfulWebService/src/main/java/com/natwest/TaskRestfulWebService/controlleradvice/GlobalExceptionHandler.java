package com.natwest.TaskRestfulWebService.controlleradvice;

import com.natwest.TaskRestfulWebService.exception.InvalidIdException;
import com.natwest.TaskRestfulWebService.exception.InvalidPriceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {


        @ExceptionHandler(InvalidPriceException.class)
        public ResponseEntity<ErrorInfo> handleExceptionForPrice(InvalidPriceException exception){

            ErrorInfo errorInfo = new ErrorInfo();
            errorInfo.setHttpstatus(HttpStatus.BAD_REQUEST);
            errorInfo.setErrorMessage(exception.getMsg());
            errorInfo.setLocalDateTime(LocalDateTime.now());

            return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
        }

        @ExceptionHandler(InvalidIdException.class)
        public String handleExceptionId(InvalidIdException exception){
            return exception.getMsg();
        }



}
