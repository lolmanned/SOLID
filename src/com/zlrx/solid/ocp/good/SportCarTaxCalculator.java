package com.zlrx.solid.ocp.good;

import com.zlrx.solid.ocp.Car;

public class SportCarTaxCalculator extends TaxCalculator {

    public SportCarTaxCalculator(Car car) {
        super(car);
    }

    @Override
    public int calculateTax() {
        return 3000;
    }
}
