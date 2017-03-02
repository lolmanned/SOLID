package com.zlrx.solid.ocp.bad;

import java.util.List;

public class CarTaxCalculator {

    private final List<Car> cars;

    CarTaxCalculator(List<Car> cars) {
        this.cars = cars;
    }

    public void calculateTax() {

        for (Car car : cars) {
            switch (car.carType) {
                case Cabrio:
                    //szamolas logika
                    break;
                case Limusine:
                    //szamolas logika
                    break;
                case SportCar:
                    //szamolas logika
                    break;
            }
        }
    }
}
