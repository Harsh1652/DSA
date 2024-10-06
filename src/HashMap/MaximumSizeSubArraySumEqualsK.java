package HashMap;
import java.util.HashMap;


public class MaximumSizeSubArraySumEqualsK {

    public static int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, -1);

        int maxLength = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (prefixSumMap.containsKey(currentSum - k)) {
                int startIndex = prefixSumMap.get(currentSum - k);
                maxLength = Math.max(maxLength, i - startIndex);
            }

            if (!prefixSumMap.containsKey(currentSum)) {
                prefixSumMap.put(currentSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        System.out.println("Maximum size of subarray with sum equals " + k + " is: " + maxSubArrayLen(nums, k));  // Output: 4
    }
}



