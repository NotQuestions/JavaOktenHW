package lesson2.homeWork.part1;

public class Person {
    private Animal cat;
    private String firstName;
    private String lastName;
    private int age;
    private Email email;

    public Person(Animal cat, String firstName, String lastName, int age, Email email) {
        this.cat = cat;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public Animal getCat() {
        return cat;
    }

    public void setCat(Animal cat) {
        this.cat = cat;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }


}
