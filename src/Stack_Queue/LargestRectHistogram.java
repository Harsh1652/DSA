package Stack_Queue;

import java.util.Stack;
public class LargestRectHistogram {

    /* 
    //---------------------Brute Force Approach---------------------------------
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
    // TC - O(N*N)
    // SC - O(1)
    */

    //---------------------Optimal Approach---------------------------------

    static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.peek()];
                st.pop();
                int width;
                if (st.isEmpty()) {
                    width = i;
                }
                else {
                    width = i - st.peek() - 1;
                }
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
    // TC - O(N) + O(N)
    // SC - O(N)
}
