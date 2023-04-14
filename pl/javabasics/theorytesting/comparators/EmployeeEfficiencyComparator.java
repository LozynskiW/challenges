package pl.javabasics.theorytesting.comparators;

import java.util.Comparator;

public class EmployeeEfficiencyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        return Integer.compare(o1.getEfficiency(), o2.getEfficiency());
    }
}
