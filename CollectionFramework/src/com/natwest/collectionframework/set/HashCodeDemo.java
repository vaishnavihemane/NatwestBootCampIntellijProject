package com.natwest.collectionframework.set;

import com.natwest.collectionframework.Employee;

import java.util.HashSet;

public class HashCodeDemo {


    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        Employee employee1 = new Employee(2,"Ram","Manager",24,69000);

        Employee employee2 = new Employee(2,"Ram","Manager",24,69000);

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

    }
}
