package by.it.tarasevich.jd01_01;

public class Task13_MulElements {
    public static void main(String[] args) {
        int s = 1;
        int pow = 1;
        do {
            pow = pow * s;
            s++;
        }    while (s<=25);


        System.out.println("pow = " + pow);
    }
}
