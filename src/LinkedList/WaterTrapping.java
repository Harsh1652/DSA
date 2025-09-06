package LinkedList;

public class WaterTrapping {

    /* 
    //----------------------------BRUTE-------------------------------------
    static int Trap(int[] arr){
        int n = arr.length;
        int waterTrapped = 0;

        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0;
            int rightMax = 0;

            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }

            j = i;
            while (j < n){
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }

            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        return waterTrapped;
    }
        // TC - O(N*N)
        // SC - O(1)
    */

    static int trap(int[] arr){

        int n = arr.length;

        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], arr[i]);
        }

        suffix[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = Math.max(suffix[i + 1], arr[i]);
        }

        int waterTrapped = 0;

        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        return waterTrapped;

    }
    // TC - O(3 * N)
    // SC - O(N) + O(N)
    
}
