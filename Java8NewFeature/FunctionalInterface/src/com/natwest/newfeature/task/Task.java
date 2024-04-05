package com.natwest.newfeature.task;


@FunctionalInterface
interface Utility{

    int cube(int num);

}


class Test{

    int findCube1(int num){
        return num*num*num;
    }

    static int findCube2(int num){
       return num*num*num;
    }


}
public class Task {


    public static void main(String[] args) {

        // by using lamda expression

        Utility utility = (int num) -> {
            return num*num*num;
        };


        System.out.println(utility.cube(3));

        //By using method reference


        Utility utility1 = Test::findCube2;

        System.out.println(utility1.cube(3));


        // for non -static method

        Test test = new Test();

        Utility utility2 = test::findCube1;

        System.out.println(utility2.cube(3));





    }
}
