package com.natwest.collectionframework.set;

import com.natwest.collectionframework.Employee;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();


//        employee.add(new Employee(2,"Ram","Manager",24,69000));
//        employee.add(new Employee(3,"Shyam","Developer",28,973000));
//        employee.add(new Employee(4,"Sachin","hr",35,39000));
//        employee.add(new Employee(5,"Rahul","Developer",22,89700));

        names.add("john");
        names.add("john");

        System.out.println(names);



        HashSet<Employee> employees = new HashSet<>();

         employees.add(new Employee(1,"Zohn","hr",22,25000));
        employees.add(new Employee(1,"Zohn","hr",22,25000));

        System.out.println(employees);


    }
}
