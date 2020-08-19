package lesson3.HW.task5.second;

public class Second implements Creator {
    private int lenght;
    private int x;

    public Second(int lenght, int x) {
        this.lenght = lenght;
        this.x = x;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int[] creator() {
        int[] mas = new int[lenght];
        for (int i = 0; i < mas.length; i++) {
            mas[0] = (int)(Math.random()*x);
        }
        return mas;
    }
}
