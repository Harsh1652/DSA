package Recursion;
public class SubsequenceRec {
    static void subsequence(int ind, int[] arr, int n) {
        if (ind >= n) {
            return;
        }
        
        subsequence(ind + 1, arr, n);
        System.out.println(arr[ind]);
    }
}
