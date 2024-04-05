package com.natwest.newfeature.functionalinterface;

    class Parent
    {

        void phone(){
            System.out.println("samsung");
        }


    }


    public class AnonomysInnerClass {

        public static void main(String[] args) {


            // we override here
            com.natwest.newfeature.functionalinterface.Parent parent = new com.natwest.newfeature.functionalinterface.Parent(){

                void phone(){
                    System.out.println("nokia");
                }
            };

            System.out.print("with override");

            parent.phone();

            System.out.print("without override");

            com.natwest.newfeature.functionalinterface.Parent parent1 = new com.natwest.newfeature.functionalinterface.Parent();
            parent1.phone();

        }


}
