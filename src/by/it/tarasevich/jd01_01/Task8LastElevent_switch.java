package by.it.tarasevich.jd01_01;

import java.util.Scanner;

public class Task8LastElevent_switch {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Cash = scanner.nextInt();
        int secondpart = Cash % 10;

               if (secondpart==0 || 5== secondpart || secondpart==9 || secondpart==6|| secondpart==7|| secondpart==8)
                   System.out.println(Cash +" " + "рублей." );
               if (secondpart == 1)
                   System.out.println(Cash +" " + "рубль.");
               if (secondpart==2 || 3== secondpart || secondpart==4)
                   System.out.println(Cash +" " + "рубля." );


    }
}
