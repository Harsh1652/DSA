package Arrayss;

import java.util.Arrays;

public class RotateArrayOnePlace {
    public RotateArrayOnePlace() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int temp = arr[0];
        int n = arr.length;

        for(int i = 1; i < n; ++i) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
