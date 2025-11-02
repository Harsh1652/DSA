package Stack_Queue;

import java.util.Stack;
public class StockSpan {

    /* 
    //---------------------------------Brute Force----------------------------------
    public int[] stockSpan(int[] arr, int n) {

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int currSpan  = 0;
        

            for(int j = i - 1; j >= 0; j--){
                if(arr[j] <= arr[i]){
                    currSpan++;
                }
                else{
                    break;
                }
            }
            ans[i] = currSpan;
        }
        return ans;
    }
    // TC - O(N^2)
    // SC - O(1)
    */


    //---------------------------------Optimal----------------------------------

    private int[] findPGE(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            int currEle = arr[i];

            while(!st.isEmpty() && arr[st.peek()] <= currEle){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public int[] stockSpan(int[] arr, int n) {
        int[] pge = findPGE(arr);
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = i - pge[i];
        }
        return ans;
    }
}

// TC - O(N)
// SC - O(N)
