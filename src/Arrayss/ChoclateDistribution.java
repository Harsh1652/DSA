package Arrayss;

import java.util.Arrays;
import java.util.Formattable;

public class ChoclateDistribution {
    static int FindMinDiff(int[] arr, int m){
        int n = arr.length;
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i + m -1 < n;  i++){
            int diff = arr[i + m -1] - arr[i];

            if (diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
}
