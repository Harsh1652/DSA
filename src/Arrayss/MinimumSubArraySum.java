package Arrayss;

public class MinimumSubArraySum {
    static int MinSubArray(int target, int[] nums){
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;


        for (int right = 0; right < n ; right++){
            sum += nums[right];
            if (sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE){
            return 0;
        }
        else {
            return minLength;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = MinSubArray(target, nums);
        System.out.println("Minimum size subarray sum >= " + target + " is: " + result);  // Output: 2
    }
}
