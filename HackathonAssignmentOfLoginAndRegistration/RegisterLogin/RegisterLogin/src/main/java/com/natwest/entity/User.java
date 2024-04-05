package com.natwest.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private int age;
    private String userEmail;
    private String moileNo;
    private String password;

    public User(int userId, String userName, int age, String userEmail, String moileNo,String password) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.userEmail = userEmail;
        this.moileNo = moileNo;
        this.password = password;
    }

    public User(){

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", userEmail='" + userEmail + '\'' +
                ", moileNo='" + moileNo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
