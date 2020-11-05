package by.it.tarasevich.TasksArrPractics;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFirstArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArrays = scanner.nextInt();

        oneArray(sizeArrays);

        multiArray(sizeArrays);
        multiArrayNumberTwo(sizeArrays);
    }

    private static void multiArrayNumberTwo(int sizeArrays) {
        int[] arr = new int[sizeArrays];

        for (int i = 0; i < arr.length; i++) {
            int element = (int) (-10 + Math.random() * 20 + 1);
            arr[i] = element;
            System.out.print(arr[i]+" " + "= ");

            System.out.print(element+",");
        }

    }

    private static void oneArray(int sizeArrays) {
        int[] arr = new int[sizeArrays];

        for (int i = 0; i < arr.length; i++) {
            int elementsArray = (int) (-10 + Math.random() * 20 + 1);
            arr[i] = elementsArray;

        }
        System.out.println(Arrays.toString(arr));

    }


    private static void multiArray(int sizeArrays) {
        int[][] arr = new int[sizeArrays][sizeArrays];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                int elementsArray = (int) (-10 + Math.random() * 20 + 1);
                arr[i][j] = elementsArray;
            }

        }
        System.out.println(Arrays.deepToString(arr));

    }


}
