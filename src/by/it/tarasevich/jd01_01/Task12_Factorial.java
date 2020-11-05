package by.it.tarasevich.jd01_01;

public class Task12_Factorial {

    public static void main(String[] args) {
        int s = 1;
        int sum = 1;
        while (s <= 10) {
            sum = sum * s;
            s++;


        }
        System.out.println("sum = " + sum);
    }
}
