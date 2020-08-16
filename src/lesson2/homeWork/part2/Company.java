package lesson2.homeWork.part2;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> Departments;

    public Company(String name, ArrayList<Department> departments) {
        this.name = name;
        Departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return Departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        Departments = departments;
    }
}
