package com.natwest.newfeature.functionalinterface;


interface Payment
{

    void doPayment();
}



public class FunctionalInterface2 {

    public static void main(String[] args) {

        Payment payment = () -> System.out.println("doing the payment in cash");

        payment.doPayment();


        Payment payment2 = () -> System.out.println("online transfer payment");
        payment2.doPayment();


    }
}
