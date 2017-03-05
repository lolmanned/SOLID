package com.zlrx.solid;

import com.zlrx.solid.ocp.good.*;
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
        TaxRole sportCarTaxRole = new SportCarTaxRole(ferrari);

        Car limousin = new Car("Lincoln", Car.CarType.Limousine);
        TaxRole limousineTaxRole = new LimousineTaxRole(limousin);

        List<TaxRole> taxRoles = new ArrayList<>();
        taxRoles.add(sportCarTaxRole);
        taxRoles.add(limousineTaxRole);

        CarTaxCalculator ctc = new CarTaxCalculator(taxRoles);
        ctc.calculateTax();


    }
}
