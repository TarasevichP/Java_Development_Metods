package by.it.tarasevich.jd01_01;

import java.util.Scanner;

public class Task9_NextDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int mounth = scanner.nextInt();
        int year = scanner.nextInt();


        if (day < 31) {
            day = day + 1;
        } else if (day>=31) {
            day = 1;
            mounth = mounth + 1;
            if (mounth > 12) {
                mounth = 1;
                year = year + 1;
            }
        }
        System.out.println("tumorow will try  " + day + "." + mounth + "." + year);

    }
}
