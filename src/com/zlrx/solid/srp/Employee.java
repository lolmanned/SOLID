package com.zlrx.solid.srp;

//getter/setter/private mezok legyenek eles kodban
//vagy lombok
public class Employee {
    String name;
    int wagePerHour;

    public Employee(String name, int wagePerHour) {
        this.name = name;
        this.wagePerHour = wagePerHour;
    }
}
