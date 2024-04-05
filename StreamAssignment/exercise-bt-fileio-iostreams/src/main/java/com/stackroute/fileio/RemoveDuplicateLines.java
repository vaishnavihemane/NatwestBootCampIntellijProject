package com.stackroute.fileio;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateLines {
    //write logic to read data from input.txt and  write result to output.txt


    public void removeDuplicateLines() throws IOException {


        FileInputStream input = new FileInputStream("input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(input));


        FileOutputStream output = new FileOutputStream("output.txt");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(output));

        Scanner scanner = new Scanner(input);


        Set<String> unique = new HashSet<>();

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            unique.add(str);
//            bw.write(str);
//            bw.newLine();

        }


        for(String s : unique){
            bw.write(s);
            bw.newLine();
        }

       bw.flush();
        input.close();
        output.close();
        br.close();
        bw.close();
    }
}
