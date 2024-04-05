import searching.BinarySearch;
import searching.LinearSearch;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[] = {10, 11, 12, 14, 15};

        LinearSearch ls = new LinearSearch();
        System.out.println(ls.returningIndexThroughLS(a,14));


        BinarySearch bs = new BinarySearch();
        System.out.println(bs.returningIndexThroughBS(a, 11));

    }

}