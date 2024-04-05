package com.natwest.newfeature.functionalinterface;


interface Calculation
{

    // functional interface parameter
    void add(int a, int b);

}
public class FunctionalInterfaceDemo3 {

    public static void main(String[] args) {

        Calculation calculation = (a,b) -> System.out.println(a+b);
        calculation.add(2,4);

        Calculation calculation2 = (a,b) -> {

            if(a>b)
                System.out.println("a is greater");
            else
                System.out.println("b is greater");

        };


        calculation2.add(4,5);

    }
}
