package com.natwest.task;

public class Demo {

    public static void main(String[] args) {

        DBConnection dbConnection = new Mysql();

        dbConnection.connect();
    }
}
