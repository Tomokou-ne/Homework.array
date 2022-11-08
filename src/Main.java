import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arr = new int[]{1, 2, 3};
        double[] weight = {1.57, 7.654, 9.986};
        int[] chars = new int[]{25, 34, 15, 48, 29, 18};

        // Задача 2
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (i < chars.length - 1) {
                System.out.print(",");
            }
        }

        // Задача 3
        System.out.println(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i < arr.length && i > 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i < weight.length && i > 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if (i < chars.length && i > 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        // Задача 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
        }System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(","); }


        }





    }
}