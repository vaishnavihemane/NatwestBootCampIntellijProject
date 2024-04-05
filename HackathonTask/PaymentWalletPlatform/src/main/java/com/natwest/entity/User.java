package com.natwest.entity;

import jakarta.persistence.*;


@Entity
@Table(name="user-registration")
public class User {


        @Id
        private String  emailId;
        private String name;
        private String address;
        private String accountNo;
        private String moileNo;
        private String password;

        public User(){

        }

    public User(String emailId, String name, String address, String accountNo, String moileNo, String password) {
        this.emailId = emailId;
        this.name = name;
        this.address = address;
        this.accountNo = accountNo;
        this.moileNo = moileNo;
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getMoileNo() {
        return moileNo;
    }

    public void setMoileNo(String moileNo) {
        this.moileNo = moileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
