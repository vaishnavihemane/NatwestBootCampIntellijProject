package com.basic;

import org.testng.annotations.Test;

public class PractTest {

    @Test
    public  void Zddition(){
        System.out.println("This is addition");
    }


    //skip
    @Test(enabled=false)
    public  void Substraction(){
        System.out.println("This is substractiohn");
    }

    @Test
    public void Division(){
        System.out.println("This is Division");
    }




}
