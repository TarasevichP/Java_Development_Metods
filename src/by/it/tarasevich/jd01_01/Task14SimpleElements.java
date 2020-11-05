package by.it.tarasevich.jd01_01;

public class Task14SimpleElements {
    public static void main(String[] args) {
        int count = 0;

        for (int a = 50; a < 70; a++) {
            if (a % 2 != 0 && a % 3 != 0 && a%5 !=0 && a%7 !=0 ) {


            } else if (a % 1 == 0 || a % a == 0) {
                continue;
            }

            count++;
            if (count == 2) {
                System.out.println(a);

            }

        }
    }
}
