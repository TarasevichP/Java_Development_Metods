package by.it.tarasevich.jd01_01;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task17Buhgalter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long i = scanner.nextLong();

        String.format(Locale.CANADA_FRENCH, "%,d", i);

        NumberFormat f = NumberFormat.getInstance();
        System.out.println(f.format(i)); // 12 345 678
    }
}
