package lesson2.homeWork.part2;

public class Company {
    private String name;
    private Department[] Departments;

    public Company(String name, Department[] departments) {
        this.name = name;
        Departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return Departments;
    }

    public void setDepartments(Department[] departments) {
        Departments = departments;
    }


}
