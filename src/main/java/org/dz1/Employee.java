package org.dz1;
import java.time.LocalDate;


public class Employee {

    public Employee(String name, String Date) {
        LocalDate dateLocal = LocalDate.parse(Date);
    }

    public int compareDates(String date1, String date2) {
        LocalDate date1Local = LocalDate.parse(date1);
        LocalDate date2Local = LocalDate.parse(date2);
        return date1Local.compareTo(date2Local);
    }
}
