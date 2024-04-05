package com.natwest.newfeature.functionalinterface;



@FunctionalInterface
interface Test
{
    void display();

     //void display2();

    // n number of default and static method

    default void greet(){
        System.out.println("welcome");
    }

}


public class FunctionalInterfaceDemo1 {

    public static void main(String[] args) {



    }
}
