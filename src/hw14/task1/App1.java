package hw14.task1;

import java.util.ArrayList;
import java.util.Comparator;

public class App1 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>(Employee.employeeGenerator(5));
        System.out.println(employeeArrayList);

        Comparator<Employee> employeeComparator = new NameComparator();

        employeeArrayList.sort(employeeComparator);
        System.out.println(employeeArrayList);

        Comparator<Employee> employeeComparator1 = new NameComparator().thenComparing(new CompanyComparator());

        employeeArrayList.sort(employeeComparator1);
        System.out.println(employeeArrayList);

        Comparator<Employee> employeeComparator2 = new NameComparator().thenComparing(new CompanyComparator()).thenComparing(new AgeComparator()).thenComparing(new SalaryComparator());

        employeeArrayList.sort(employeeComparator2);
        System.out.println(employeeArrayList);
    }
    }

