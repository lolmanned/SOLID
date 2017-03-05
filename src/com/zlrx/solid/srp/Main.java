package com.zlrx.solid.srp;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee("Conan a barkács", 3000);
        SalaryCalculator sc = new SalaryCalculator(e);
        SalaryReporter sr = new StdoSalaryReporter(sc);
        sr.report();
    }

}
