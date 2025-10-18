package Stack_Queue;

import java.util.Stack;

public class NxtGreater_ele {
    
    public static int[] nextGreaterElements(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}
