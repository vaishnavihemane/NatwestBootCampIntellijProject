package com.natwest.TaskRestfulWebService.controlleradvice;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorInfo {

        private String errorMessage;
        private HttpStatus httpstatus;
        private LocalDateTime localDateTime;


        public ErrorInfo(String errorMessage, HttpStatus status, LocalDateTime localDateTime) {
            this.errorMessage = errorMessage;
            this.httpstatus = status;
            this.localDateTime = localDateTime;
        }

        public ErrorInfo(){

        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public HttpStatus getHttpstatus() {
            return httpstatus;
        }

        public void setHttpstatus(HttpStatus httpstatus) {
            this.httpstatus = httpstatus;
        }

        public LocalDateTime getLocalDateTime() {
            return localDateTime;
        }

        public void setLocalDateTime(LocalDateTime localDateTime) {
            this.localDateTime = localDateTime;
        }


}
