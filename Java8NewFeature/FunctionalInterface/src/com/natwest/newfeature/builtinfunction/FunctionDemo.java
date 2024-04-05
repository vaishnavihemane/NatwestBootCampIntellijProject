package com.natwest.newfeature.builtinfunction;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> findLength = (name) -> name.length();
        System.out.println(findLength.apply("Vaishnavi"));

        Function<Integer,Integer> findCube = (num)->num*num*num;
        System.out.println(findCube.apply(3));
    }
}
