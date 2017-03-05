package com.zlrx.solid.ocp;

public class Car {
    public String manufacturer;
    public CarType carType;

    public Car(String manufacturer, CarType carType) {
        this.manufacturer = manufacturer;
        this.carType = carType;
    }

    public enum CarType {
        SportCar, Limousine, Cabrio
    }
}
