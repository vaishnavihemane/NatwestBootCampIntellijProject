package com.natwest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {


    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        EmployeeCrud employeeCrud = (EmployeeCrud) context.getBean("getEmployeeInstance");
       //  employeeCrud.createTable();
         employeeCrud.InsertData();
    }
}
