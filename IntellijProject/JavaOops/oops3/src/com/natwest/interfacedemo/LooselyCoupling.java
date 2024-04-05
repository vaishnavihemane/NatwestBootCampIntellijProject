package com.natwest.interfacedemo;



interface Payment{

    void doPayment();

}


class Upi implements Payment{

    @Override
    public void doPayment() {
        System.out.println("doing the payment from upi");
    }
}


class Cash implements Payment{


    @Override
    public void doPayment() {
        System.out.println("doing the payment from cash");
    }
}


public class LooselyCoupling {


    public static void main(String[] args) {


        Payment payment = new Cash();
        payment.doPayment();

    }
}
