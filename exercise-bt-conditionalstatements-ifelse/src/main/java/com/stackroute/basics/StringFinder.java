package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable



    //Create Scanner object as instance variable.
// Instant
    private static Scanner sc;
    public static void main(String[] args) {

        StringFinder stringFinder = new StringFinder();

        sc = new Scanner(System.in);
        //Get three strings from the user
        String searchString = stringFinder.getInput();
        String firstString = stringFinder.getInput();
        String secondString = stringFinder.getInput();

        stringFinder.displayResult(stringFinder.findString(searchString,firstString,secondString));

        stringFinder.closeScanner();

    }

    public String getInput(){
        return sc.nextLine();
    }

    public void displayResult(int result) {

        //displays the result
        if(result == 1){
            System.out.println("Found as expected");
        }
        else if(result == -1){
            System.out.println("Empty string or null");
        }
        else{
            System.out.println("Not found");
        }


    }

    public int findString(String searchString, String firstString, String secondString) {

        if (searchString == null || firstString == null || secondString == null || searchString.isEmpty() || firstString.isEmpty() || secondString.isEmpty()){
            return -1;
        }
        else if(searchString.startsWith(firstString) &&  searchString.endsWith(secondString)) {
            return 1;
        }
        else{
            return 0;
        }

    }

    public void closeScanner() {
        if (sc==null) {
            sc.close();;
        }
    }
}

