package org.dz2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("Employee1", 50000);
        Employee employee2 = new Employee("Employee2", 55000);
        Supervisor supervisor = new Supervisor("Manager1", 75000);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(supervisor);

        System.out.println("Зарплата до повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        Supervisor.salariesUp(employees, 20);

        System.out.println("\nЗарплата после повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}
