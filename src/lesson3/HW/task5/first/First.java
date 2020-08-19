package lesson3.HW.task5.first;

public class First implements Voice{
    private String message ;

    public First() {
        this.message = "аааааааа!!!!!";

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void scream() {
        System.out.println(message);
    }
}
