package Stack_Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMax {
    
    /*
    //--------------------------------Brute Force Approach---------------------------------
    static void GetMax(int arr[], int l, int r, ArrayList<Integer> maxx){
        int max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++){
            max = Math.max(max, arr[i]);
        }
        maxx.add(max);
    }
    static ArrayList<Integer> maxSlidingWindow(int arr[], int k){
        int left = 0;
        int right = 0;
        int i, j;
        ArrayList<Integer> maxx = new ArrayList<>();
        while (right < k-1){
            right++;
        }
        while (right < arr.length){
            GetMax(arr,left,right,maxx);
            left++;
            right++;
        }

        return maxx;
    }

    // TC - O(N ^ 2)
    // SC - O(K)
    */


    //--------------------------------Optimal Approach---------------------------------
    static int[] maxSlidingWindow(int[] a, int k){
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++){
            if (!q.isEmpty() && q.peek() == i-k) {
                q.poll();
            }
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
        // TC - O(N)
        // SC - O(K)
    }

}