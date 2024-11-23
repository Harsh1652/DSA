package Stack_Queue;

import java.util.Stack;

public class AreaOfLargestRectangle {

    /*
    // BruteForce
    static int larggestarea(int[] arr, int n){
        int maxArea = 0;
        for (int i = 0; i < n; i++){
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n ; j++){
                minHeight = Math.min(minHeight, arr[j]);
                maxArea =Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;

        // Tc - O(N*N)
        // Sc - O(1)
    }
     */


    /*
    // Better
    public static int largestRectangleArea(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];

        for (int i = 0; i < n; i++){
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if (st.isEmpty()){
                leftSmall[i] = 0;
            }
            else {
                leftSmall[i] = st.peek() + 1;
                st.push(i);
            }
        }
        st.clear();

        for (int i = n - 1; i >= 0; i--){
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if (st.isEmpty()){
                rightSmall[i] = n - 1;
            }
            else {
                rightSmall[i] = st.peek() - 1;
            }
            st.push(i);
        }
        int max = 0;
        for (int i = 0; i < n ; i++){
            max = Math.max(max, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return max;

        // Tc - O(N)
        // Sc - O(3N)
    }
     */

    static  int largestRectangleArea(int histo[]){
        Stack<Integer> st = new Stack<>();

        int max = 0;
        int n = histo.length;

        for (int i = 0; i <= n ; i++){
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])){
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty()){
                    width = i;
                }
                else {
                    width = i - st.peek() - 1;
                }
                max = Math.max(max, width * height);
            }
            st.push(i);
        }
        return max;

        // Tc - O(N) + O(N)
        // SC - O(N)
    }


}
