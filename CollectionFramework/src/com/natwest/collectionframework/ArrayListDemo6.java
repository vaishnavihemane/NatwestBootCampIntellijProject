package com.natwest.collectionframework;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee(1,"John","hr",22,25000));
        employee.add(new Employee(2,"Ram","Manager",24,69000));
        employee.add(new Employee(3,"Shyam","Developer",28,789000));


        System.out.println(employee);

        for(Employee employee1 : employee){
            System.out.println(employee1);
        }



        employee.forEach(System.out::println);
    }
}
