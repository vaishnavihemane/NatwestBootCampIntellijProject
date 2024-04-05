package com.natwest.newfeature.builtinfunction;

import java.util.function.Function;
import java.util.function.Predicate;

public class Task {

    public static void main(String[] args) {


        Function<Integer,String> function = (age) -> (age>18) ? "eligible" : "not eligible" ;

        System.out.println(function.apply(34));


    }
}
