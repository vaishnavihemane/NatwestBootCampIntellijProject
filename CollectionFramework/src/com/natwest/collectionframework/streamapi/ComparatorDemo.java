package com.natwest.collectionframework.streamapi;

import com.natwest.collectionframework.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee(1,"Zohn","hr",22,25000));
        employee.add(new Employee(2,"Ram","Manager",24,69000));
        employee.add(new Employee(3,"Shyam","Developer",28,973000));
        employee.add(new Employee(4,"Sachin","hr",35,39000));
        employee.add(new Employee(5,"Rahul","Developer",22,89700));

        Collections.sort(employee,new NameSorting());
        employee.forEach(System.out::println);
    }


}


class AgeSorting implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {

        if(o1.getAge() > o2.getAge())
            return 1;
        else if(o1.getAge() < o2.getAge())
            return -1;
        return 0;
    }
}


class NameSorting implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getName().compareTo(o2.getName());

    }
}