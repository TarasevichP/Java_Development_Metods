package by.it.tarasevich.jd01_01;

import java.util.Scanner;

public interface Sum_end_sub {

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int c = a+b;
    int d = a*b;

    int finish = c + d;
}
