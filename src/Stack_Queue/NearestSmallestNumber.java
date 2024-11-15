package Stack_Queue;

import java.util.Stack;

public class NearestSmallestNumber {

    public static int[] nearestSmallestElement(int[] nums) {
        int n = nums.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && st.peek() >= nums[i]) {
                st.pop();
            }

            nse[i] = st.empty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return nse;
    }

    // TC - O(2N)
    // SC - O(N) + O(N)
}
