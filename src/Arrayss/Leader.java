package Arrayss;

import java.util.Arrays;

public class Leader {

    public static String superiorElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int[] output = new int[n];
        int j = 0;

        for(int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                output[j] = arr[i];
                j++;
            }

            max = Math.max(max, arr[i]);
        }

        output = Arrays.copyOfRange(output, 0, j);
        return Arrays.toString(output);
    }
}
