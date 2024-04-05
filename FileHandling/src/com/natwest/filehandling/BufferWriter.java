package com.natwest.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("xyz.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("hello");
        bw.newLine();
        bw.write("Welcome");
        bw.newLine();
        bw.write("java");

        bw.flush();
        bw.close();





    }
}
