package by.it.tarasevich.jd01_02;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5 + 1);

            System.out.println(" элемент массива "+i + " = " + array[i]);
            if (i%2 == 0) {
                System.out.println("позиция i= "+ i);
            }
        }
        System.out.println("finish element = " + (array[9]));

    }
}
