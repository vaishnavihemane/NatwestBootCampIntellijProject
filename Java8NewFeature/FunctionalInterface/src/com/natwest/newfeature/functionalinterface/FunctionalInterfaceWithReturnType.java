package com.natwest.newfeature.functionalinterface;


interface Calculation2
{
    int add(int a, int b);
}
public class FunctionalInterfaceWithReturnType {

    public static void main(String[] args) {

        //for single body no need for return type

        Calculation2 calculation1 = (a,b) -> a+b;

        Calculation2 calculation2 = (a,b) -> {
            if(a>b)
                return a;
            else
                return b;
        };


        System.out.println(calculation1.add(2,3));

        System.out.println(calculation2.add(5,6));


    }
}
