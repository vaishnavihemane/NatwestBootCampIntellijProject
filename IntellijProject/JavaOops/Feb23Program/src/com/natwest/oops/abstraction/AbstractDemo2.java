package com.natwest.oops.abstraction;





abstract class RBI{

    int workingHour;

    RBI(int workingHour){
        this.workingHour = workingHour;
    }


    abstract int rateOfInterest(int roi);

    void greet(){
        System.out.println("welcome to online banking");
    }

}



class Axis extends RBI{

    Axis(int workingHour) {
        super(workingHour);
    }

    @Override
    int rateOfInterest(int roi) {
        return roi;
    }
}



public class AbstractDemo2 {

    public static void main(String[] args) {

        RBI rbi = new Axis(7);
        System.out.println("Working hour :"+ rbi.workingHour);
        System.out.println("ROI : " + rbi.rateOfInterest(8));



    }
}
