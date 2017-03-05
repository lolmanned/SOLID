package com.zlrx.solid.ocp.good;

public class LimousineTaxRole extends TaxRole {

    public LimousineTaxRole(Car car) {
        super(car);
    }

    @Override
    public int calculateTax() {
        return 2000;
    }
}
