package Arrayss;

import java.util.IllegalFormatCodePointException;

public class MaxAndMinElementsArray {
    static void arr(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (n == 0 || arr == null){
            System.out.println("Array is Empty or null");
        }

        for (int i = 0; i <= n; i++){
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
