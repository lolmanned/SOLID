package com.zlrx.solid.ocp.bad;

public class Car {
    String manufacturer;
    CarType carType;

    public enum CarType {
        SportCar, Limusine, Cabrio
    }
}
