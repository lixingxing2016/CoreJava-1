package com.github.frankkwok.corejava.v1ch05.inheritance;

import java.time.LocalDate;

/**
 * @author Frank Kwok on 2017/3/29.
 */
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    Employee(String name, double salary, int year, int month, int dayOfMonth) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, dayOfMonth);
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    LocalDate getHireDay() {
        return hireDay;
    }

    void raiseSalary(double byPercent) {
        salary = salary * (1 + byPercent / 100);
    }
}
