package com.natwest.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("xyz.txt",true);

        fw.write("hello");
        fw.write("65");



        fw.flush(); // flush means it guarranty that data will sended to the file
        fw.close(); // close means we can't add data again




    }
}
