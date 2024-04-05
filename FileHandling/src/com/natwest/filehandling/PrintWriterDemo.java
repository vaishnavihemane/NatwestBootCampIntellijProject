package com.natwest.filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("demo1.txt");

        pw.write("hi");
        pw.println();
        pw.write(98);
        pw.println();
        pw.print(98);
        pw.println();

        pw.flush();
        pw.close();


    }
}
