package com.natwest.collectionframework.streamapi;

import com.natwest.collectionframework.ArrayListDemo2;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo1 {
//
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("elements are : " + nums);

        System.out.println("without using stream");

        
        for(int num : nums){

            if(num%2==0){
                System.out.println(num);
            }
        }


        System.out.println("using stream");

        nums.stream().filter(n->n%2==0).forEach(s-> System.out.println(s));
    }
}
