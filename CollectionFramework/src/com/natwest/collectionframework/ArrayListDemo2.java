package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo2 {


    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(23);
        nums.add(24);
        nums.add(25);


        System.out.println(nums);

        nums.remove(Integer.valueOf(0));

        System.out.println("after removing"+nums);
        System.out.println("");
    }
}
