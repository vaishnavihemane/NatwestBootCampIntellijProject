package com.natwest.newfeature.functionalinterface;


interface MaximumNumber
{

    String large(int a, int b, int c);
}


public class Task {

    public static void main(String[] args) {

        MaximumNumber maximumNumber = (a,b,c) -> {

            if(a>b && a>c)
                return a+"";
            else if (b>a && b>c)
                return b+"";
            else
                return c+"";

            };


        System.out.println(maximumNumber.large(3,4,5));

        }



}
