

package Arrayss;

public class MaximumProductSubarray {

    public static int SubArrayMaxProduct(int[] arr) {
        int prefix = 1;
        int suffix = 1;
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; ++i) {
            if (prefix == 0) {
                prefix = 1;
            }

            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= arr[i];
            suffix *= arr[n - i - 1];
            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }
}
