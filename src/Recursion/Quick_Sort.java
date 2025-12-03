package Recursion;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quick_Sort {
    public Quick_Sort() {
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
}
