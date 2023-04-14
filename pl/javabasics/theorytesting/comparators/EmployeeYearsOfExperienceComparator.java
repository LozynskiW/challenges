package pl.javabasics.theorytesting.comparators;

import java.util.Comparator;

public class EmployeeYearsOfExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //(x < y) ? -1 : ((x == y) ? 0 : 1);
        return (o1.getYearsOfExperience() > o2.getYearsOfExperience()) ? 1 :
                (o1.getYearsOfExperience() == o2.getYearsOfExperience() ? 0 : -1);
    }
}
