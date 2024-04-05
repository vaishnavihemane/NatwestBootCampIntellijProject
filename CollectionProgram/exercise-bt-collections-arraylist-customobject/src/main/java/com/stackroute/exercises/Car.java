package com.stackroute.exercises;

// Custom Class
public class Car {

    private String modelName;
    private String manufacturerName;
    private int engineCapacity;
    private String carType;

    public Car(String modelName, String manufacturerName, int engineCapacity, String carType) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.engineCapacity = engineCapacity;
        this.carType = carType;
    }




    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "{" +
                "modelName: '" + modelName + '\'' +
                ", manufacturerName: '" + manufacturerName + '\'' +
                ", engineCapacity: " + engineCapacity +
                ", carType: '" + carType + '\'' +
                '}';
    }
}
