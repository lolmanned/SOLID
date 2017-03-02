package com.zlrx.solid.ocp.good;


import java.util.List;

public class CarTaxCalculator {

    private final List<Car> cars;

    public CarTaxCalculator(List<Car> cars) {
        this.cars = cars;
    }

    public void calculateTax() {
        for (Car car : cars) {
            int tax = car.taxRole.calculateTax();
            System.out.println(car.manufacturer + " adója: " + tax);
        }
    }
}
