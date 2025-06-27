package Arrayss;

import java.util.ArrayList;

public class SortArray0s1s2s {
    static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1){
                mid++;
            }
            else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
    }
    
}
