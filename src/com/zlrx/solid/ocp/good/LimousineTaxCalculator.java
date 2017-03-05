package com.zlrx.solid.ocp.good;

import com.zlrx.solid.ocp.Car;

public class LimousineTaxCalculator extends TaxCalculator {

    public LimousineTaxCalculator(Car car) {
        super(car);
    }

    @Override
    public int calculateTax() {
        return 2000;
    }
}
