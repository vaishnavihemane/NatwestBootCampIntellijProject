package com.natwest.oops.abstraction;


abstract class Calculation{

    //method requirement
    abstract int input(int a, int b);
}


class Add extends Calculation{


    @Override
    int input(int a, int b) {
        return a+b;
    }
}



class Sub extends Calculation{

    @Override
    int input(int a, int b) {
        return a-b;
    }
}
public class AbstractDemo {

    public static void main(String[] args) {

        Calculation calculation1 = new Add();
        System.out.println(calculation1.input(3,4));


        Calculation calculation2 = new Sub();
        System.out.println(calculation2.input(4,3));


    }
}
