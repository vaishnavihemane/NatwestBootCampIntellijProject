package com.natwest.task;

public class Oracle implements DBConnection{
    @Override
    public void connect() {
        System.out.println("connected by oracle");
    }
}
