package HashMap;
import java.util.HashMap;

public class SubArraySumDivisibleByK {

    public static int subarraySumDivisibleByK(int[] nums, int k) {
        if (k == 0){
            return 0;
        }

        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;
            int remainder = currentSum % k;

            if (remainder < 0) {
                remainder += k;
            }


            if (remainderCount.containsKey(remainder)) {
                count += remainderCount.get(remainder);
            }


            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        System.out.println("Number of subarrays with sum divisible by " + k + " is: " + subarraySumDivisibleByK(nums, k));  // Output: 4
    }
}



