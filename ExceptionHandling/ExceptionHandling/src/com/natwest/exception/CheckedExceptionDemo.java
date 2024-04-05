package com.natwest.exception;

import java.io.File;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        File file = new File("abc.txt");

        // checked exception(compile time)
      //  file.createNewFile();
    }
}
