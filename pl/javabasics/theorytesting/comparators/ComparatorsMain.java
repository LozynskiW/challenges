package pl.javabasics.theorytesting.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorsMain {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, 8);
        Employee e2 = new Employee(3, 7);
        Employee e3 = new Employee(5, 10);
        Employee e4 = new Employee(10, 5);

        List<Employee> employeeList = new ArrayList<>(List.of(e1, e2, e3, e4));

        System.out.println("Before sorting: " + employeeList);
        employeeList.sort(new EmployeeEfficiencyComparator());
        System.out.println("After sorting by efficency: " + employeeList);

        Collections.sort(employeeList);
        System.out.println("After sorting by years: " + employeeList);

        List<Employee> employeesByEfficency = employeeList.stream().sorted(new EmployeeEfficiencyComparator()).collect(Collectors.toList());

        System.out.println("After sorting by efficency: " + employeesByEfficency);

    }
}
