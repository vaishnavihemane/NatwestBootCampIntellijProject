package com.natwest.collectionframework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo
{
    public static void main(String[] args) {


        HashMap<Integer,String> name=new HashMap<>();
        name.put(4,"sonu");
        name.put(1,"nikita");
        name.put(2,"poonam");
        name.put(3,"rani");


        System.out.println(name);
        System.out.println();

        LinkedHashMap<Integer,String> name2=new LinkedHashMap<>();
        name2.put(4,"sonu");
        name2.put(1,"Nikita");
        name2.put(2,"ponam");
        name2.put(3,"rani");


        System.out.println(name2);
        System.out.println();

        TreeMap<Integer,String> name3=new TreeMap<>();
        name3.put(4,"sonu");
        name3.put(1,"Nikita");
        name3.put(2,"ponam");
        name3.put(3,"rani");

        System.out.println(name3);





    }
}
