package by.it.tarasevich.jd01_01;


import java.util.Scanner;

public class Operatory_switch_if {

    static Scanner scanner = new Scanner(System.in);
    static int a  = scanner.nextInt();

    static String temp = Integer.toString(a);
    static int[] guess = new int[temp.length()];
    static int last = guess[temp.length() - 1];


    public static void main(String[] args) {

        if ( last== 7) {
            System.out.println("все верно , на конце семерка");

        }else{
            System.out.println("false");
        }
    }
}
