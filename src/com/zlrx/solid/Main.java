package com.zlrx.solid;

import com.zlrx.solid.srp.Employee;
import com.zlrx.solid.srp.SalaryCalculator;
import com.zlrx.solid.srp.SalaryReporter;
import com.zlrx.solid.srp.StdoSalaryReporter;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee("Conan a barkács", 3000);
        SalaryCalculator sc = new SalaryCalculator(e);
        SalaryReporter sr = new StdoSalaryReporter(sc);
        sr.report();
    }
}
