package lesson2.homeWork.part2;

public class Employee {
    private String name;
    private String subName;
    private int experience;
    private String position;

    public Employee(String name, String subName, int experience, String position) {
        this.name = name;
        this.subName = subName;
        this.experience = experience;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
