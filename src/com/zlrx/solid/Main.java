package com.zlrx.solid;

import com.zlrx.solid.ocp.good.Car;
import com.zlrx.solid.ocp.good.CarTaxCalculator;
import com.zlrx.solid.ocp.good.SportCarTaxRole;
import com.zlrx.solid.ocp.good.TaxRole;
import com.zlrx.solid.srp.Employee;
import com.zlrx.solid.srp.SalaryCalculator;
import com.zlrx.solid.srp.SalaryReporter;
import com.zlrx.solid.srp.StdoSalaryReporter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee("Conan a barkács", 3000);
        SalaryCalculator sc = new SalaryCalculator(e);
        SalaryReporter sr = new StdoSalaryReporter(sc);
        sr.report();


        TaxRole tr = new SportCarTaxRole();
        Car car = new Car("Ferrari", Car.CarType.SportCar, tr);
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        CarTaxCalculator ctc = new CarTaxCalculator(cars);
        ctc.calculateTax();
    }
}
