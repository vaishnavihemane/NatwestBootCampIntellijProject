package com.natwest.collectionframework.list;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> names = new Stack<>();
        names.push("apple");
        names.add("banana");
        names.push("mango");


        System.out.println("peek : " + names.peek());

        System.out.println("names : " + names);
        System.out.println("pop : " + names.pop());
        System.out.println("names : " + names);

        System.out.println("pop : " + names.pop());
        System.out.println("names : " + names);

        System.out.println("pop : " + names.pop());
        System.out.println("names : " + names);


    }
}
