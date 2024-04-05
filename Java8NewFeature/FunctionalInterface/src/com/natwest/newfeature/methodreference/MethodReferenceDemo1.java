package com.natwest.newfeature.methodreference;



@FunctionalInterface
interface User
{
    void greet();

}



class Employee{

    static void mygreeting(){
        System.out.println("employee greeting");
    }
}






public class MethodReferenceDemo1 {

    public static void main(String[] args) {

        // implementing using lamda expression

        User user = () -> {

            System.out.println("User greeting");
            System.out.println("thnx");
        };


        // method reference for the static method

        User user1 = Employee::mygreeting;
        user1.greet();

    }
}
