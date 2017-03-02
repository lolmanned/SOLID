package com.zlrx.solid.ocp.good;

public class SportCarTaxRole extends TaxRole {

    @Override
    public int calculateTax() {
        return 3000;
    }
}
