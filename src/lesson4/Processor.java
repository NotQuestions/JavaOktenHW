package lesson4;

import java.util.Objects;

public class Processor {
    private String type;
    private int cores;
    private double frequency;
    private Country made;

    public Processor(String type, int cores, double frequency, Country made) {
        this.type = type;
        this.cores = cores;
        this.frequency = frequency;
        this.made = made;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Country getMade() {
        return made;
    }

    public void setMade(Country made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", cores=" + cores +
                ", frequency=" + frequency +
                ", made=" + made +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return cores == processor.cores &&
                Double.compare(processor.frequency, frequency) == 0 &&
                Objects.equals(type, processor.type) &&
                made == processor.made;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cores, frequency, made);
    }
}
