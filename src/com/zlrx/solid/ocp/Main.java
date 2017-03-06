package com.zlrx.solid.ocp;

import com.zlrx.solid.ocp.good.LimousineTaxCalculator;
import com.zlrx.solid.ocp.good.SportCarTaxCalculator;
import com.zlrx.solid.ocp.good.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Car mustang = new Car("Mustang", Car.CarType.SportCar);
        TaxCalculator sportCarTaxCalculator = new SportCarTaxCalculator(mustang);

        Car limousin = new Car("Lincoln", Car.CarType.Limousine);
        TaxCalculator limousineTaxCalculator = new LimousineTaxCalculator(limousin);

        List<TaxCalculator> taxCalculators = new ArrayList<>();
        taxCalculators.add(sportCarTaxCalculator);
        taxCalculators.add(limousineTaxCalculator);

        for (TaxCalculator tc : taxCalculators) {
            System.out.println(tc.getCar().manufacturer + " adója: " + tc.calculateTax() + " HUF");
        }
    }

}
