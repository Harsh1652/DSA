package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;
import Stack_Queue.ImplementStackUsingArray.stack;


public class NxtSmallerEle {

    /*
      -----------------BRUTE ----------------------------------------------
      public static int[] nextSmallerElements(int[] arr) {
      int n = arr.length;
      int[] ans = new int[n];
      Arrays.fill(ans, -1);
      for (int i = 0; i < n; i++) {
      int curr = arr[i];
      for (int j = i + 1; j < n; j++) {
      if (arr[j] < curr) {
      ans[i] = arr[j];
      break;
      }
      }
      }
      return ans;
      }
      // TC - O(N^2)
     // SC - O(N)
     */

    // -----------------OPTIMAL ----------------------------------------------

    public static int[] nextSmallerElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    // TC - O(N)
    // SC - O(N)

}
