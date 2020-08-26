package lesson5.Task1;

import java.util.Objects;

public class Computer implements Comparable<Computer>{
    private String model;
    private int year;
    private int price;
    private HardDisk disk;
    private Processor processor;

    public Computer(String model, int year, int price, HardDisk disk, Processor processor) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.disk = disk;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Computer() {
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                price == computer.price &&
                Objects.equals(model, computer.model) &&
                Objects.equals(disk, computer.disk) &&
                Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, price, disk, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", disk=" + disk +
                ", processor=" + processor +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        return this.price-o.price;
    }
}
