package com.zlrx.solid.ocp.good;


import java.util.List;

public class CarTaxCalculator {

    private final List<TaxRole> taxRoles;

    public CarTaxCalculator(List<TaxRole> taxRoles) {
        this.taxRoles = taxRoles;
    }

    public void calculateTax() {
        for (TaxRole taxRole : taxRoles) {
            int tax = taxRole.calculateTax();
            System.out.println(taxRole.getCar().manufacturer + " adója: " + tax);
        }
    }
}
