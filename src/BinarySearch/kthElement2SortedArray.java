package BinarySearch;

import java.util.ArrayList;

public class kthElement2SortedArray {
    /*
    ------------------------------BRUTE--------------------------------------------------
    public static int kthElement(ArrayList<Integer>a, ArrayList<Integer>b,int m , int n , int k ){
        ArrayList<Integer>arr3 = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < m &&  j < n){
            if (a.get(i) < b.get(j)){
                arr3.add(a.get(i++));
            }
            else {
                arr3.add(b.get(j++));
            }
        }
        while (i < m){
            arr3.add(a.get(i++));
        }
        while (j < n){
            arr3.add(b.get(j++));
        }

        return arr3.get(k-1);
    }
    // TC - O(M+N)
    // SC - O(M+N)
     */


    /*
    //------------------------------------BETTER---------------------------------------------------
    public static int kthElement(ArrayList<Integer>a, ArrayList<Integer>b,int m , int n , int k ) {
        int ele = -1;
        int cnt = 0;

        int i = 0;
        int j = 0;

        while(i < m & j < n){
            if (a.get(i) < b.get(j)){
                if (cnt == k-1){
                    ele = a.get(i);
                }
                cnt++;
                i++;
            }
            else{
                if (cnt == k-1){
                    ele = b.get(j);
                }
                cnt++;
                j++;
            }
        }
        while (i < m){
            if (cnt == k-1){
                ele = a.get(i);
            }
            cnt++;
            i++;
        }
        while (j < n){
            if (cnt == k-1){
                ele = b.get(j);
                cnt++;
                j++;
            }
        }
        return ele;
    }

    // TC - O(M+N)
    // SC - O(1)

     */


    //----------------------------------OPTIMAL-------------------------------------------------------------
    public static int kthElement(ArrayList<Integer>a, ArrayList<Integer>b,int m , int n , int k ) {

        if (m > n){
            return kthElement(b,a,n,m,k);
        }

        int left = k;

        int low = Math.max(0,k-n);
        int high = Math.min(k,m);

        while (low <= high){
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if (mid1 < m){
                r1 = a.get(mid1);
            }
            if (mid2 < n){
                r2= b.get(mid2);
            }

            if (mid1 - 1 >= 0){
                l1 = a.get(mid1-1);
            }
            if (mid2 - 1 >= 0){
                l2 = a.get(mid2-1);
            }

            if (l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            } else if (l1  > l2) {
                high = mid1 -1;
            }
            else {
                low = mid1 + 1;
            }
        }
        return 0;
    }

    // TC - O(log(min(M,N)))
    // SC - O(1)





    }
