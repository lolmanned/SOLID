package com.zlrx.solid;

import com.zlrx.solid.ocp.Car;
import com.zlrx.solid.ocp.good.LimousineTaxCalculator;
import com.zlrx.solid.ocp.good.SportCarTaxCalculator;
import com.zlrx.solid.ocp.good.TaxCalculator;
import com.zlrx.solid.srp.Employee;
import com.zlrx.solid.srp.SalaryCalculator;
import com.zlrx.solid.srp.SalaryReporter;
import com.zlrx.solid.srp.StdoSalaryReporter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //srp
        Employee e = new Employee("Conan a barkács", 3000);
        SalaryCalculator sc = new SalaryCalculator(e);
        SalaryReporter sr = new StdoSalaryReporter(sc);
        sr.report();

        //ocp
        Car ferrari = new Car("Mustang", Car.CarType.SportCar);
        TaxCalculator sportCarTaxCalculator = new SportCarTaxCalculator(ferrari);

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
