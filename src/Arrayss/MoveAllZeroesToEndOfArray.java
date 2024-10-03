package Arrayss;

import java.util.Arrays;

public class MoveAllZeroesToEndOfArray {
    public MoveAllZeroesToEndOfArray() {
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int j = -1;

        int i;
        for(i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for(i = j + 1; i < n; ++i) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                ++j;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
