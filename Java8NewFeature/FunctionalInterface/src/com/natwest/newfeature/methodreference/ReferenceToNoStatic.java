package com.natwest.newfeature.methodreference;



interface Addition
{
    int add(int a, int b);
}

public class ReferenceToNoStatic {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        Addition addion = calculation::plus;

        System.out.println(addion.add(4,3));




    }
}
