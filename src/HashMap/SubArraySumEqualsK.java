package HashMap;
import java.util.HashMap;
public class SubArraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int resultCount = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixSumCount.containsKey(currentSum - k)) {
                resultCount += prefixSumCount.get(currentSum - k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return resultCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println("Number of subarrays with sum " + k + " is: " + subarraySum(nums, k)); // Output: 2
    }
}


