package com.natwest.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {


    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("xyz.txt");

//        System.out.println((char)fr.read());
//        System.out.println(fr.read());
//        System.out.println(fr.read());
//        System.out.println(fr.read());


        int ch = fr.read();

        while(ch!=-1){
            System.out.println((char)ch);
            ch = fr.read();
        }

        System.out.println();




    }
}
