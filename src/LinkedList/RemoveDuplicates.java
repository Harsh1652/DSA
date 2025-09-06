package LinkedList;

import java.util.HashSet;

public class RemoveDuplicates {

    /* 
    --------------------------------------BRUTE-----------------------------------
    static int RemoveDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        int k = set.size();
        int j = 0;
        for(int x: set){
            arr[j++] = x;
        }
        return k;
    }
    // TC - O(n*log(n))+O(n)
    // SC - O(n)
    */

    //-------------------------------OPTIMAL-------------------------------
     static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    // TC - O(N)
    // SC - O(1)
}
