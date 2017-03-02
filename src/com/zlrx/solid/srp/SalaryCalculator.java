package com.zlrx.solid.srp;

public class SalaryCalculator {

    private final Employee employee;

    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    public int calculateMonthlySalary() {
        return employee.wagePerHour * 8 * 20;
    }


    /*
     * eltavolitva, serti az egy felelosseg elvet
     */
//    public void reportSalary() {
//        System.out.println(String.format("%s havi bére %d HUF", employee.name, calculateMonthlySalary()));
//    }

}
