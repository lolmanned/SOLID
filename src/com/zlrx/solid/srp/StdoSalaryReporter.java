package com.zlrx.solid.srp;

public class StdoSalaryReporter implements SalaryReporter {

    private final SalaryCalculator salaryCalculator;

    public StdoSalaryReporter(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public void report() {
        System.out.println(salaryCalculator.calculateMonthlySalary() + " HUF/hónap");
    }
}
