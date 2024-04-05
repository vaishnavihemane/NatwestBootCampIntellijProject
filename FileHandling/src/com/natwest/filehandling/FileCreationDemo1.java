package com.natwest.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo1 {

    public static void main(String[] args) throws IOException {

        //System.out.println("file handling demo");

        File file = new File("C:\\Users\\rbs\\Desktop\\FileHandling");

        if(file.exists()){
            System.out.println("file is present");
        }
        else{
            System.out.println("file is not present");
            file.createNewFile();
        }


    }

}
