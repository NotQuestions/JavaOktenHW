package lesson5.Task1;

import java.util.Objects;

public class HardDisk {
    private String model;
    private Disk diskType;
    private int sizeDisk;
    private Country country;

    public HardDisk(String model, Disk diskType, int sizeDisk, Country country) {
        this.model = model;
        this.diskType = diskType;
        this.sizeDisk = sizeDisk;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Disk getDiskType() {
        return diskType;
    }

    public void setDiskType(Disk diskType) {
        this.diskType = diskType;
    }

    public int getSizeDisk() {
        return sizeDisk;
    }

    public void setSizeDisk(int sizeDisk) {
        this.sizeDisk = sizeDisk;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "model='" + model + '\'' +
                ", diskType=" + diskType +
                ", sizeDisk=" + sizeDisk +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisk hardDisk = (HardDisk) o;
        return sizeDisk == hardDisk.sizeDisk &&
                Objects.equals(model, hardDisk.model) &&
                diskType == hardDisk.diskType &&
                country == hardDisk.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, diskType, sizeDisk, country);
    }
}
