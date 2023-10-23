package org.dz1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Artem", "2018-05-10");
        String date1 = "2023-07-10";
        String date2 = "2023-06-10";

        int result = employee.compareDates(date1, date2);

        if (result < 0) {
            System.out.println(date1 + " до " + date2);
        } else if (result > 0) {
            System.out.println(date1 + " после " + date2);
        } else {
            System.out.println(date1 + " равна " + date2);
        }
    }
}