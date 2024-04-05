package com.natwest.exception;

public class ExceptionDemo2 {


    public static void main(String[] args) {

        System.out.println("get ready");
        System.out.println("breakfast");
        System.out.println("travel for 30 mts");


        try {
            System.out.println(2 / 0);
            System.out.println("login");
        }
        catch(Exception exception){

            System.out.println("exception occured");
        }


        System.out.println("start the day");
        System.out.println();
    }

}