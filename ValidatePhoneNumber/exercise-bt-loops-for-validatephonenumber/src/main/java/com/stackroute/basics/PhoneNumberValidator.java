package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //call the functions in the required sequence
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
       String phone = phoneNumberValidator.getInput();

       int num = phoneNumberValidator.validatePhoneNumber(phone);
       phoneNumberValidator.displayResult(num);

       phoneNumberValidator.closeScanner();
    }

    public String getInput() {
        return sc.nextLine();
    }

    public void displayResult(int result) {
        //displays the result

        if(result == 1){
            System.out.println("Valid");
        }
        else if(result == -1){
            System.out.println("emptystring");
        }
        else{
            System.out.println("Invalid");
        }

    }

    public int validatePhoneNumber(String input) {
        if(input == null || input.isEmpty()){
            return -1;
        }

        String newString = input.replaceAll("-","");

        if(newString.matches("\\d{10}")){
            return 1;
        }
        else {
            return 0;
        }

    }

    public void closeScanner(){
        //close the Scanner object
        sc.close();
    }
}
