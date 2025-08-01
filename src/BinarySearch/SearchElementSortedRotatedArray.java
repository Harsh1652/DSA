package BinarySearch;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class SearchElementSortedRotatedArray {
    /*
    //-----------------------BRUTE--------------------------------------------
    public static int search(ArrayList<Integer> arr, int n, int k){
        for (int i = 0; i < n; i++){
            if (arr.get(i) == k){
                return i;
            }
        }
        return -1;
    }

    // TC - O(N)
    // SC - O(1)
     */



    //---------------------OPTIMAL---------------------------------------
    public static int search(ArrayList<Integer> arr, int n, int k){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr.get(mid) == k){
                return mid;
            }

            if (arr.get(low) <= arr.get(mid)){
                if (arr.get(low) <= k && k <= arr.get(mid)){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if (arr.get(mid) <= k && k <= arr.get(high)){
                    low = mid + 1;
                }
                else {
                    high = mid + 1;
                }
            }
        }
        return -1;
    }

    // TC - O(log N)
    // SC - O(1)
}
