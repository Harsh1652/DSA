package Arrayss;

import java.util.Arrays;

public class SortArrayOf_0_1_2 {
    public SortArrayOf_0_1_2() {
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                ++mid;
                ++low;
            } else if (arr[mid] == 1) {
                ++mid;
            } else if (arr[mid] == 2) {
                swap(arr, mid, high);
                --high;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
