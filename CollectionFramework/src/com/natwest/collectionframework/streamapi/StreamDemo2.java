package com.natwest.collectionframework.streamapi;

import com.natwest.collectionframework.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

    public static void main(String[] args) {

        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee(1,"Zohn","hr",22,25000));
        employee.add(new Employee(2,"Ram","Manager",24,69000));
        employee.add(new Employee(3,"Shyam","Developer",28,973000));
        employee.add(new Employee(4,"Sachin","hr",35,39000));
        employee.add(new Employee(5,"Rahul","Developer",22,89700));

        // does not sort
        Collections.sort(employee);
        employee.forEach(System.out::println);



        System.out.println("<=================================================>");


        employee.stream().
                filter(employee1 -> employee1.getDept().equals("hr")).
                forEach(System.out::println);


            // count of all hr

        long countOfHr = employee.stream().
                filter(e -> e.getDept().equals("hr")).
                count();


        System.out.println(" Count of Hr " + countOfHr);

//        employee.stream().filter(e -> e.getDept().equals("Developer")).
//                map(e -> e.getSalary() + e.getSalary() * 0.10).forEach(System.out::println);
//

        employee.stream().filter(e -> e.getDept().equals("Developer")).
                map(e -> e + "" + e.getSalary() + e.getSalary() * 0.10).forEach(System.out::println);


        List<Employee> employees1 =  employee.stream().filter(e -> e.getAge()>25).collect(Collectors.toList());

        System.out.println(employees1);

        employees1.forEach(System.out::println);

        System.out.println("<=================================================>");

        employee.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);


        System.out.println("<=================================================>");
        // sorting the employee by age

        employee.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);


        System.out.println("<=================================================>");
        //sorted by employee salary

        employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);


        System.out.println("<=================================================>");

        // age in descending order

        employee.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);


        System.out.println("<=================================================>");

        // if age is same then comparing on the basis of name

        System.out.println("With method reference");
        employee.stream().sorted().
                sorted(Comparator.comparingInt(Employee::getAge).
                        thenComparing(Employee::getName)).forEach(System.out::println);



        System.out.println("<=================================================>");


        System.out.println("Using lambda");

        employee.stream().sorted((a,b)->{

            if(a.getAge() > b.getAge())
                return 1;
            else if(a.getAge() < b.getAge())
                return -1;
            return 0;
        }).forEach(System.out::println);






    }
}
