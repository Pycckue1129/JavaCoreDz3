package org.dz2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {
    private String name;
    private double salary;

    public void salaryUp(double percent) {
        salary *= (1 + percent / 100);
        salary = Math.round(salary);
    }

}
