package com.natwest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result = 0;


        try{

        System.out.println("enter the value of a ");
        int a = scanner.nextInt();

        System.out.println("enter the value of b");
        int b = scanner.nextInt();

            result = a / b;
        }
        catch (ArithmeticException ex){
            System.out.println("do not enter 0");
        }
        catch (InputMismatchException exception){
            System.out.println("enter only numbers.");
        }

        System.out.println("Result : "+ result);
    }
}
