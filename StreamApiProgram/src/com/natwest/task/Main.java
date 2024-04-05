package com.natwest.task;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {


            ArrayList<Wrestler> wrestlers = new ArrayList<>();

            wrestlers.add(new Wrestler(1, "Sayali", 250.5, 75, 43));
            wrestlers.add(new Wrestler(2, "The Rock", 65, 74, 49));
            wrestlers.add(new Wrestler(3, "Stone Cold Steve Austin", 245.8, 73, 57));
            wrestlers.add(new Wrestler(4, "Triple H", 255.1, 74, 52));
            wrestlers.add(new Wrestler(5, "Undertaker", 175.0, 81, 55));
            wrestlers.add(new Wrestler(6, "Hulk Hogan", 145.7, 76, 69));
            wrestlers.add(new Wrestler(7, "Randy Orton", 250.9, 76, 41));
            wrestlers.add(new Wrestler(8, "Sally", 76.8, 75, 44));

            WrestlerImplementation wrestlerImplementation = new WrestlerImplementation();

            System.out.println(wrestlerImplementation.countAllWrestler(wrestlers));

            System.out.println("<=================================>");

            List<Wrestler> list = wrestlerImplementation.findAlltheWhoseNameStartWithS(wrestlers);

            list.stream().forEach(System.out::println);

            System.out.println("<=================================>");

            System.out.println(wrestlerImplementation.countOfAllWrestlerWhoseWeightisGreaterThan200(wrestlers));


            System.out.println("<=================================>");
            wrestlerImplementation.displayAllWrestlerNameInAscendingWhoseWeightisGreaterThan150(wrestlers).forEach(System.out::println);

            System.out.println("<================================>");


            wrestlerImplementation.displayAllTheWrestlerBasedOnHeightInDescendingOrder(wrestlers).forEach(System.out::println);

        }




}
