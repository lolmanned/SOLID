package com.zlrx.solid.ocp.good;

public class Car {
    String manufacturer;
    CarType carType;
    TaxRole taxRole;

    public Car(String manufacturer, CarType carType, TaxRole taxRole) {
        this.manufacturer = manufacturer;
        this.carType = carType;
        this.taxRole = taxRole;
    }

    public enum CarType {
        SportCar, Limusine, Cabrio
    }
}
