package com.natwest.exception;

public class ExceptionDemo3 {

    public static void main(String[] args) {

        try{
            System.out.println("hello");
            System.out.println(2/0);
            System.out.println("welcome");
        }
        catch(ArithmeticException ex){

            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
