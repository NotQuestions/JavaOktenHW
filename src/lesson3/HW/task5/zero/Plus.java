package lesson3.HW.task5.zero;

public class Plus implements Calculator{
    @Override
    public void calculate(int a, int b) {
        System.out.println(a+b);
    }
}
