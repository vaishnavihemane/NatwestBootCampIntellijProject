package com.natwest.oops.interfacedemo;


interface RBI{

    //static and final variable we can not change
    String currency = "rupees";

    int minimumBalance = 300;


    void rateOfInterest(); // bydefault it is public & abstract


}



class Axis implements RBI{


    @Override
    public void rateOfInterest() {
        System.out.println("axis roi, 4%");
        System.out.println("minimum balance "+ RBI.minimumBalance);
        System.out.println("currentcy " + currency);
    }
}




public class InterfaceDemo {
    public static void main(String[] args) {

    }
}
