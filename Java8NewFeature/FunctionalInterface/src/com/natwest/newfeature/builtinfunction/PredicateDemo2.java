package com.natwest.newfeature.builtinfunction;

import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void main(String[] args) {

        Predicate<Integer> evenOdd = (num) -> num%2==0;

        System.out.println(evenOdd.test(2));

        Predicate<Integer> greatherThan = (num) -> num > 5;
        System.out.println(greatherThan.test(5));


        
    }
}
