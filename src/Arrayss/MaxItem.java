package Arrayss;

import java.util.Arrays;

public class MaxItem {


    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int value = var2[var4];
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];

        for(int i = start; i < end; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void rev(int[] arr) {
        int start = 0;

        for(int end = arr.length - 1; start < end; --end) {
            swap(arr, start, end);
            ++start;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 23, 9, 18};
        System.out.println(max(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
