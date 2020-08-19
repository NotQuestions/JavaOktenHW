package lesson3.HW.task5.second;

public class First implements Creator {
    private int lenght;
    @Override
    public int[] creator() {
        int[] mas = new int[lenght];
        for (int i = 0; i < mas.length; i++) {
            mas[0] = (int)(Math.random()*diapazon);
        }
        return mas;
    }
}
