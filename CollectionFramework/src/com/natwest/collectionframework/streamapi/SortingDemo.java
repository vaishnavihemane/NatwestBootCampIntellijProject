package com.natwest.collectionframework.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingDemo {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,4,6,3));

        Collections.sort(nums);
        System.out.println(nums);


    }
}
