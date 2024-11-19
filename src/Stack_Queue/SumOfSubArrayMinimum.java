package Stack_Queue;

import java.util.Stack;

public class SumOfSubArrayMinimum {

    /*
    //---------------------------------------Brute Force Approach---------------------------------------------
    static int SubarrayMin(int arr[]){
        int sum = 0;
        int mod = (int)(1e9 + 7);
        int n = arr.length;
        for (int i = 0; i <= n-1; i++){
            int mini = arr[i];
            for (int j = i; j <= n-1; j++){
                mini = Math.min(mini, arr[j]);
                sum = (sum + mini)%mod;
            }
        }
        return sum;
    }
    // TC - O(N^2)
    // SC - O(1)
     */



    //--------------------------Optimal Approach-------------------------------------------------------------

    static int SubarrayMin(int arr[]) {
        int[] NSE = findNse(arr);      // NSE -> Next Smaller Element
        int[] PSE = findPsee(arr);     // PSE -> Previous Smaller Element
        int total = 0;
        int mod = (int)(1e9 + 7);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int left = i - PSE[i];
            int right = NSE[i] - i;

            total = (int) ((total + (right * 1L * left * arr[i]) % mod) % mod);
        }
        return total;
    }

    static int[] findNse(int arr[]) {
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    static int[] findPsee(int arr[]) {
        int n = arr.length;
        int[] psee = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

    // TC - O(5N)
    // SC - O(5N)
}


