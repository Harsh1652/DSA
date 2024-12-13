package Arrayss;

public class maxSubArraySum {


    public static long maxSubArraySum(int[] arr, int n) {
        long max = Long.MIN_VALUE;
        long sum = 0L;
        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        int i;
        for(i = 0; i < n; ++i) {
            if (sum == 0L) {
                start = i;
            }

            sum += (long)arr[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0L) {
                sum = 0L;
            }
        }

        System.out.print("The Subarray is: [");

        for(i = ansStart; i <= ansEnd; ++i) {
            System.out.print(arr[i]);
            if (i < ansEnd) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubArraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
