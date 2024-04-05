package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class) ;
            DbConnection dbConnection=(DbConnection) context.getBean("getInstanceOfDbConnection");
            System.out.println(dbConnection.getUserName());
            System.out.println(dbConnection.getPassword());

        }


        
}