package com.will;

public class empyloyee {
    public int baseSalary;
    private int hourlyRate;
    public int extraHours;

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less!");
            this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be less then zero");
        this.hourlyRate = hourlyRate;
    }
}
