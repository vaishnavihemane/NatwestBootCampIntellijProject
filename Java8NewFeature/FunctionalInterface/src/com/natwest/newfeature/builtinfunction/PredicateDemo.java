package com.natwest.newfeature.builtinfunction;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate <Integer> p1 = (age) -> age>18;
        System.out.println(p1.test(3));


        Predicate <String> p2 = (str) -> str.contains("a");
        System.out.println(p2.test("vaish"));

    }
}
