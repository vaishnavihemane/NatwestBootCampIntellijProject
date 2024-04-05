package com.natwest.collectionframework.task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("biscut");
        list1.add("lays");
        list1.add("ice cream");
        list1.add("burger");
        list1.add("maggi");
        list1.add("water");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("maggi");
        list2.add("water");
        list2.add("cake");
        list2.add("biryani");
        list2.add("sandwitch");

        System.out.println("element of list1 "+list1);
        System.out.println("element of list2 "+list2);

        list1.removeAll(list2);
        list1.addAll(list2);

        Collections.sort(list1);

        System.out.println(list1);


    }
}
