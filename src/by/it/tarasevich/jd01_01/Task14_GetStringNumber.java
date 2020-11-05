package by.it.tarasevich.jd01_01;

public class Task14_GetStringNumber {

    public static void main(String[] args) {
        String i = "7893823445" ;
       String[] a = i.split("");
       int m = 0;
        for (int j = 0; j <a.length; j++) {
            m=  m + Integer.parseInt(a[j]);
        }
        System.out.println("m = "+m );



    }
}
