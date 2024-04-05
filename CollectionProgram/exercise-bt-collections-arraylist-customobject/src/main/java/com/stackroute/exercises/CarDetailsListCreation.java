package com.stackroute.exercises;


import java.util.ArrayList;

public class CarDetailsListCreation {
    //Write here logic to return global list variable

    ArrayList<Car> cars = new ArrayList<>();
    public String getCarDetails(){

        return cars.toString();

}






    //Write here logic to add value to global list variable
    public void setCarDetails(String modelName, String manufacturerName, int engineCapacity, String carType) throws OutOfRangeException, WrongInputException {


            if(modelName==null || manufacturerName==null||carType == null ||modelName.isEmpty() || modelName.isBlank() ||manufacturerName.isEmpty() || manufacturerName.isBlank()||  carType.isEmpty() || carType.isBlank()){
                throw new WrongInputException("Input might contain a null or empty or blank space value");
            }
            else if (!carType.equalsIgnoreCase("HatchBack") && !carType.equalsIgnoreCase("SUV") && !carType.equalsIgnoreCase("Sedan") && !carType.equalsIgnoreCase("PickupTruck")){
                throw new WrongInputException("CarType '"+carType+"' is not present in the enumeration");

            }
            else if(!(engineCapacity >= 1000 && engineCapacity <= 10000)) {
                throw new OutOfRangeException("EngineCapacity is out of range(1000 to 10000)");
            }



        cars.add(new Car(modelName, manufacturerName, engineCapacity, carType));
          //  cars.add(car);


    }

}
