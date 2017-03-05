package com.zlrx.solid.ocp.good;

public class SportCarTaxRole extends TaxRole {

    public SportCarTaxRole(Car car) {
        super(car);
    }

    @Override
    public int calculateTax() {
        return 3000;
    }
}
