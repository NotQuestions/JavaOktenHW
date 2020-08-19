package lesson3.HW.task5.first;

public class Main {
    public static void main(String[] args) {
        msg(new First());
        msg(new Second());
    }
    public static void msg(Voice voice){
        voice.scream();
    }
}
