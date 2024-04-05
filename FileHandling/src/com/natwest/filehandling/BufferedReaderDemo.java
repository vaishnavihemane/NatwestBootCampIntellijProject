package com.natwest.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("xyz.txt");
        BufferedReader br = new BufferedReader(fr);

        // It read line by line

//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());


        String str = br.readLine();

        while(str!=null){
            System.out.println(str);
            str = br.readLine();
        }



    }
}
