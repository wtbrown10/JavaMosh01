package com.will;

public class empyloyee {
    public int baseSalary;
    public int hourlyRate;
    public int extraHours;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
