package com.zlrx.solid.ocp.bad;

import com.zlrx.solid.ocp.Car;

public class CarTaxCalculator {

    private final Car car;

    CarTaxCalculator(Car car) {
        this.car = car;
    }

    public int calculateTax() {
        switch (car.carType) {
            case Cabrio:
                return 1000;
            case Limousine:
                return 2000;
            case SportCar:
                return 3000;
            default:
                return 0;
        }
    }
}
