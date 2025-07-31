package BinarySearch;

import java.util.ArrayList;

public class SearchSingleElement {
    /*
    //--------------------BRUTE----------------------------
    public static int SingleNonDuplicate(ArrayList<Integer>arr){
        int n = arr.size();
        if (n == 1){
            return arr.get(0);
        }
        for (int i = 0; i < n; i++){
            if (i == 0){
                if(!arr.get(i).equals(arr.get(i+1))){
                    return arr.get(i);
                } else if (i == n-1) {
                    if (!arr.get(i).equals(arr.get(i - 1))) {
                        return arr.get(i);
                    }
                }
            }
        }
        return -1;
    }

    // TC - O(N)
    // SC - O(N)
     */


    /*
    //-----------------------BETTER------------------------------------
    public static int SingleNonDuplicate(ArrayList<Integer>arr){
        int n = arr.size();
        int ans = 0;

        for (int i = 0; i<n; i++){
            ans = ans ^ arr.get(i);
        }
        return ans;
    }

    // TC - O(N)
    // SC - O(1)
     */




    //---------------------OPTIMAL---------------------------------------
    public static int SingleNonDuplicate(ArrayList<Integer>arr){
        int n = arr.size();
        if (n == 1){
            return arr.get(0);
        }

        if(!arr.get(0).equals(arr.get(1))){
            return arr.get(0);
        }

        if (!arr.get(n-1).equals(arr.get(n-2))){
            return arr.get(n-1);
        }

        int low = 1;
        int high = n-2;

        while (low <= high){
            int mid = (low + high)/2;

            if(!arr.get(mid).equals(arr.get(mid+1)) && !arr.get(mid).equals(arr.get(mid-1))){
                return arr.get(mid);
            }

            if ((mid % 2 == 1 && arr.get(mid).equals(arr.get(mid-1))) || (mid %2 ) == 0 && arr.get(mid).equals(arr.get(mid+1))){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    // TC - O(logN)
    // SC - O(1)

}
