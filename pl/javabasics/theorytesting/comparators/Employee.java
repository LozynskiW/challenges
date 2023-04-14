package pl.javabasics.theorytesting.comparators;

public class Employee implements Comparable<Employee>{

    private int yearsOfExperience;
    private int efficiency;

    public Employee(int yearsOfExperience, int efficiency) {
        this.yearsOfExperience = yearsOfExperience;
        this.efficiency = efficiency;
    }

    public Employee() {
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", efficiency=" + efficiency +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (Integer.compare(o.getYearsOfExperience(), this.getYearsOfExperience()));
    }
}
