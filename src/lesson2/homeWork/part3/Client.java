package lesson2.homeWork.part3;

public class Client {
    private String subName;
    private String name;
    private String dob;
    private Passport passport;

    public Client(String subName, String name, String dob, Passport passport) {
        this.subName = subName;
        this.name = name;
        this.dob = dob;
        this.passport = passport;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
