package by.it.tarasevich.jd01_01;

import java.util.Scanner;

public interface Watch_and_timer {

    Scanner scanner = new Scanner(System.in);
    int time = scanner.nextInt();

    int minutes = time/60;
    int hours  = minutes /60;
    int days = hours/24;
    int weeks = days/7;

    int s = time%60;
    int m = (time-s)/60;
    int checTimeMinute = m%60;
    int h = (checTimeMinute-m)/60;
    int checTimeHoures = h%24;
    int ds = (checTimeHoures-h)/24;
    int checTimeDays = ds %7;
    int w = (checTimeDays-ds)/7;





}
