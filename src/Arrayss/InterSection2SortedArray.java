

package Arrayss;

import java.util.Arrays;

public class InterSection2SortedArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = new int[]{2, 3, 3, 5, 6, 6, 7};
        int[] tempOutput = new int[Math.min(arr1.length, arr2.length)];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ++i;
            } else if (arr1[i] > arr2[j]) {
                ++j;
            } else {
                tempOutput[k++] = arr1[i];
                ++i;
                ++j;
            }
        }

        System.out.println(Arrays.toString(tempOutput));
    }
}
