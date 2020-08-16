package lesson2.homeWork.part2;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
}
