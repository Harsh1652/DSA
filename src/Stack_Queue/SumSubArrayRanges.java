package Stack_Queue;

import java.util.Stack;

public class SumSubArrayRanges {

    /*
    // BruteForce
    public int subArrayRanges(int arr[]) {

        int sum = 0;
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++){

            int largest = arr[i];
            int smallest = arr[i];
            for (int j = i+1; j < n; j++){
                largest = Math.max(largest,arr[j]);
                smallest = Math.min(smallest,arr[j]);

                sum = sum + (largest - smallest);
            }
        }
        return sum;
    }

    // TC - O(N^2)
    // SC - O(1)
     */


    // Optimal Method
    public long subArrayRanges(int arr[]){
        int n = arr.length;
        int j;
        int k;

        long res = 0;

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= n; i++){
            while (!s.isEmpty() && arr[s.peek()] > (i == n ? Integer.MIN_VALUE:arr[i])){
                j = s.pop();
                k = s.isEmpty() ? -1: s.peek();

                res -= (long)arr[j] * (i -j) *(j -k);
            }
            s.push(i);
        }
        s.clear();
        for (int i = 0; i <= n; i++){
            while (!s.isEmpty() && arr[s.peek()] < (i == n ? Integer.MAX_VALUE: arr[i])){
                j = s.pop();
                k = s.isEmpty() ? -1: s.peek();

                res += (long) arr[j] * (i -j) * (j -k);
            }
            s.push(i);
        }
        return res;
    }

    // TC - O(5N) ~ O(N)
    // SC - O(5N) ~ O(N)
}
