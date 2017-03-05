package com.zlrx.solid.ocp.good;

import com.zlrx.solid.ocp.Car;

public abstract class TaxCalculator {

    protected final Car car;

    public TaxCalculator(Car car) {
        this.car = car;
    }

    public abstract int calculateTax();

    public Car getCar() {
        return car;
    }
}
