package Arrayss;

public class LongestSubArraySum {

    public static int longestSubarrayWithSumLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxLength = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 8;

        int result = longestSubarrayWithSumLessThanK(nums, k);
        System.out.println("The longest subarray with sum <= " + k + " is: " + result);
    }
}
