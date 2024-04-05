package com.natwest.dto;

public class UserDTO {

    private String  emailId;
    private String name;
    private String address;
    private String accountNo;
    private String moileNo;

    public UserDTO(){

    }

    public UserDTO(String emailId, String name, String address, String accountNo, String moileNo) {
        this.emailId = emailId;
        this.name = name;
        this.address = address;
        this.accountNo = accountNo;
        this.moileNo = moileNo;
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


}
