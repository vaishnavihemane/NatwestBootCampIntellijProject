package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);


        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(4);
        num2.add(5);
        num2.add(6);
        num2.add(7);
        num2.add(8);

        // addall, removeall, retainall

        System.out.println("element of num1 : " + num1);
        System.out.println("element of num2 ; " + num2);

      //  num1.addAll(num2);

       // num1.removeAll(num2);

        System.out.println(num1);

        num1.retainAll(num2);
        System.out.println("after retain " + num2);
    }
}
