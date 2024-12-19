package Arrayss;

import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {

    /*
    //-----------------Brute-----------------------------------------
    static boolean dup(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
     */


    /*
    //---------------------Better-----------------------------------------
    static boolean dup(int[] nums){
        Arrays.sort(nums);
        int n  = nums.length;

        for (int i= 0 ; i < n ;i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
     */


    //------------------------Optimal------------------------------------------

    static boolean dup(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int num: nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}


