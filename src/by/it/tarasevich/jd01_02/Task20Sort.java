package by.it.tarasevich.jd01_02;

public class Task20Sort {
    public static void main(String[] args) {
        int min ;
        int max = 0;
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 1);

            min = array[i];
//            System.out.print(" " + array[i] + "  ");
            if (max <= min) {
                max = min;
                System.out.println("Index max element = " + i + " max element = " + max);
//                System.out.println("Index max element = " + i + " max element = " + max);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("index i = " + i);
            }
        }



    }
}
