package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add(1,"cherry");
        fruits.add("banana");


        System.out.println("fruits : "+ fruits);

        fruits.remove("mango");
        System.out.println("After removing " + fruits);

        System.out.println("returns number of elements " + fruits.size());

        fruits.set(0,"Pineapple");

    }
}
