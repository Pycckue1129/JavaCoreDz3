package org.dz2;

import java.util.List;


public class Supervisor extends Employee{
    public Supervisor(String name, double salary) {
        super(name, salary);
    }

    public static void salariesUp(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Supervisor)) {
                employee.salaryUp(percentage);
            }
        }
    }
}
