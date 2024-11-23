package Stack_Queue;

import java.util.Stack;

public class MaximalRectangle {

    static int lhist(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || heights[st.peek()] >= heights[i])) {
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }

    static int maxRec(int mat[][]) {
        if (mat == null || mat.length == 0) return 0;

        int n = mat.length;
        int m = mat[0].length;
        int maxArea = 0;

        int[] preSum = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                preSum[j] = (mat[i][j] == 0) ? 0 : preSum[j] + 1;
            }
            maxArea = Math.max(maxArea, lhist(preSum));
        }
        return maxArea;
    }

}
