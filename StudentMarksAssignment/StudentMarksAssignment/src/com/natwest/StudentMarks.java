package com.natwest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.max;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter number of student : ");

        int student = sc.nextInt();

        double sum = 0;

        System.out.println("Enter Marks : ");
        for(int i=0; i<student; i++){

            marks.add(sc.nextInt());
            sum = sum + marks.get(i);

        }


        System.out.println("Highest marks : "+max(marks));
        System.out.println("Average marks : " + sum/student );
        System.out.println("Marks : ");

        for(int i=0; i<student; i++){
            System.out.println("student "+(i+1)+"-"+marks.get(i));
        }

        System.out.println("3rd Student marks "+marks.get(2));

        System.out.println("Sorted : ");
        Collections.sort(marks);
        for(int i=0; i<student; i++){
            System.out.println((i+1)+"-"+marks.get(i));
        }


    }
}
