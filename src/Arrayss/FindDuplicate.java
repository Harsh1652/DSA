package Arrayss;

import java.util.Arrays;

public class FindDuplicate {

    /*
    // Brute Force Approach
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i++) {
            if(nums[i] == nums[i+1])
            {
                return nums[i];
            }
        }
        return -1;
    }
    // TC = O(nlogn) + O(N)
    // SC = O(1)
    */


    // Optimal Approach
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int i = 0; i<n; i++){
            if(freq[nums[i]] == 0){
                freq[nums[i]]++;
            }
            else{
                return nums[i];
            }
        }
         return -1;
    }
    // TC = O(N)
    // SC = O(N)

    public static void main(String args[]) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}