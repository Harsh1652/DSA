package Recursion;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public QuickSort() {
    }

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = (Integer)arr.get(low);
        int i = low;
        int j = high;

        int temp;
        while(i < j) {
            while((Integer)arr.get(i) <= pivot && i <= high - 1) {
                ++i;
            }

            while((Integer)arr.get(j) > pivot && j >= low + 1) {
                --j;
            }

            if (i < j) {
                temp = (Integer)arr.get(i);
                arr.set(i, (Integer)arr.get(j));
                arr.set(j, temp);
            }
        }

        temp = (Integer)arr.get(low);
        arr.set(low, (Integer)arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }

    }

    public static void main(String[] args) {
        new ArrayList();
        List<Integer> arr = Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3);
        int n = arr.size();
        System.out.println("Before Using QuickSort: ");

        PrintStream var10000;
        Object var10001;
        int i;
        for(i = 0; i < n; ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print("" + var10001 + " ");
        }

        System.out.println();
        qs(arr, 0, n - 1);
        System.out.println("After QuickSort: ");

        for(i = 0; i < n; ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print("" + var10001 + " ");
        }

        System.out.println();
    }
}
