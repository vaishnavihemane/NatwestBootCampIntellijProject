package com.natwest.collectionframework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add( "apple" );
        hashSet.add( "banana" );
        hashSet.add( "pineapple" );
        hashSet.forEach( System.out::println );


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add( "apple" );
        linkedHashSet.add( "banana" );
        linkedHashSet.add( "pineapple" );
        linkedHashSet.forEach( System.out::println );



        TreeSet<String> ts = new TreeSet<>();
        ts.add( "apple" );
        ts.add( "banana" );
        ts.add( "pineapple" );

        ts.forEach( System.out::println );


    }
}
