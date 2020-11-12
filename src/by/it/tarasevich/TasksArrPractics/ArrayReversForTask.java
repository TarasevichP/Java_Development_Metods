package by.it.tarasevich.TasksArrPractics;

public class ArrayReversForTask {
    public static void main(String[] args) {

        int [] arr= new int[10];

        for (int i = 0; i < args.length-1 ; i++) {
            int element = (int) (-10 + Math.random() * 10);
            arr[i] =element;
                    System.out.println(i +" --- >"+ arr[i]);
        }

    }
}
