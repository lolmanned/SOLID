package com.zlrx.solid.ocp.good;

public class LimusineTaxRole extends TaxRole {

    @Override
    public int calculateTax() {
        return 2000;
    }
}
