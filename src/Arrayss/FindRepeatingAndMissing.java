package Arrayss;

public class FindRepeatingAndMissing {
    
    // Brute Force Approach
    /*
    public static int[] findRepeatingAndMissing(int[] nums){
        int n  = nums.length;
        int repeating = -1;
        int missing = -1;
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for (int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt >= 2){
                repeating = i;
            }
            if(cnt == 0){
                missing = i;
            }

            if (repeating != -1 && missing != -1){
                break;
            } 
        }
        int[] ans = {repeating, missing};
        return ans;
    }
    // TC = O(N^2)
    // SC = O(1)
    */


    /* 
    // Better Approach
    public static int[] findRepeatingAndMissing(int[] nums){
        int n = nums.length;
        int [] hash = new int[n+1];
        int repeating = -1;
        int missing = -1;

        for(int i = 0; i< n; i++){
            hash[nums[i]]++;
        }
        for(int i = 0; i< n; i++){
            if(hash[i] >= 2){
                repeating = i;
            }
            if(hash[i] == 0){
                missing = i;
            }
            if (repeating != -1 && missing != -1){
                break;
            }
        }
        int[] ans = {repeating, missing};
        return ans;
    }
    // TC = O(2N)
    // SC = O(N)
    */

    public static void main(String args[]){
        int[] nums = {1,2,2,4};
        int[] ans = findRepeatingAndMissing(nums);
        System.out.println(ans[0] + " " + ans[1]);
    }

    
}

