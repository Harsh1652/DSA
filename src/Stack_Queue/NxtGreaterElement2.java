package Stack_Queue;

import java.util.Stack;

public class NxtGreaterElement2 {

/*
    //METH - 1
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];

        for (int i = 0; i < n; i++) {
            nge[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < i + n; j++) {
                int ind = j % n;
                if (nums[ind] > nums[i]) {
                    nge[i] = nums[ind];
                    break;
                }
            }
        }

        return nge;

        // TC - O(N^2)
        // SC - O(N)
    }
 */

    //METH - 2

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                nge[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(nums[i % n]);
        }

        return nge;
    }
    public static void main(String[] args) {

    }
}
