package practice.Task1;

public class Cinderella {
    private String name;
    private int age;
    private int footSize;
    private Prince prince;

    public Cinderella() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    public Prince getPrince() {
        return prince;
    }

    public void setPrince(Prince prince) {
        this.prince = prince;
    }

    public Cinderella(String name, int age, int footSize) {
        this.name = name;
        this.age = age;
        this.footSize = footSize;
    }
}
