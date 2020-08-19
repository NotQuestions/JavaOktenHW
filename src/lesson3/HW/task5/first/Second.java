package lesson3.HW.task5.first;

public class Second implements Voice {
    private String massage;

    public Second() {
        this.massage = "ууууууууу";
    }


    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void scream() {
        System.out.println(massage);
    }
}
