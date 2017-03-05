package com.zlrx.solid.ocp.good;

public class Car {

    String manufacturer;
    CarType carType;

    public Car(String manufacturer, CarType carType) {
        this.manufacturer = manufacturer;
        this.carType = carType;
    }

    public enum CarType {
        SportCar, Limousine, Cabrio
    }
}
