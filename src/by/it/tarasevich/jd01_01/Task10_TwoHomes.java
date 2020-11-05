package by.it.tarasevich.jd01_01;

import java.util.Scanner;

public class Task10_TwoHomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры первого дома - ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Введите размеры второго  дома - ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println("Введите размеры  участка - ");
        int f = scanner.nextInt();
        int e = scanner.nextInt();
        int sumHomes = b + d;
        if (a >= c) {
            if (a >= f) {
                if (sumHomes >= e) {
                    System.out.println("Дома вмещаются на участок");
                }
            }else if(c>= f)
                System.out.println("норм кусок");

        } else {
            System.out.println("Купите другой участок побольше");
        }


    }
}
