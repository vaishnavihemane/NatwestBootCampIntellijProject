package com.natwest.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WrestlerImplementation {

        public long countAllWrestler(ArrayList arraylist){
            return arraylist.stream().count();

        }

        public List<Wrestler> findAlltheWhoseNameStartWithS(ArrayList<Wrestler> arrayList){

            List<Wrestler> listOfName = arrayList.stream()
                    .filter(wrestler -> wrestler.getName().startsWith("S")).collect(Collectors.toList());
            return listOfName;

            //sout

        }


        public long countOfAllWrestlerWhoseWeightisGreaterThan200(ArrayList<Wrestler> arrayList){

            return arrayList.stream().filter(w -> w.getWeight()>200).count();
        }

        public List<Wrestler> displayAllWrestlerNameInAscendingWhoseWeightisGreaterThan150(ArrayList<Wrestler> arrayList){

            List<Wrestler> listOfName = arrayList.stream().filter(w -> w.getWeight() > 150).sorted(Comparator.comparing(Wrestler::getName)).collect(Collectors.toList());
            return listOfName;

        }

        public List<Wrestler> displayAllTheWrestlerBasedOnHeightInDescendingOrder(ArrayList<Wrestler> arrayList){

            List<Wrestler> listOfName = arrayList.stream().sorted(((w1,w2) ->w2.getHeight()-w1.getHeight())).collect(Collectors.toList());
            return listOfName;
        }


}
