package com.zlrx.solid.ocp.good;

public abstract class TaxRole {

    protected final Car car;

    public TaxRole(Car car) {
        this.car = car;
    }

    public abstract int calculateTax();

    public Car getCar() {
        return car;
    }
}
