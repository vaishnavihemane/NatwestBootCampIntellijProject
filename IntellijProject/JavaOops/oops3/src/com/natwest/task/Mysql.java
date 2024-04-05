package com.natwest.task;

public class Mysql implements DBConnection{
    @Override
    public void connect() {
        System.out.println("connected by mysql");
    }
}
