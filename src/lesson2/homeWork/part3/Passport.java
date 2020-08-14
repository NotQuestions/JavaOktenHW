package lesson2.homeWork.part3;

public class Passport {
    private String serie;
    private long number;
    private String issuedBy;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Passport(String serie, long number, String issuedBy) {
        this.serie = serie;
        this.number = number;
        this.issuedBy = issuedBy;
    }
}
