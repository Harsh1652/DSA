package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class AllocateMinimumNoPages {


    /*
    //---------------------------BRUTE--------------------------------------
    public static int cntStudents(ArrayList<Integer>arr, int pages){
        int n = arr.size();
        int students = 1;

        long pagesStudnets = 0;

        for (int i = 0; i < n; i++){
            if (pagesStudnets + arr.get(i) <= pages){
                pagesStudnets += arr.get(i);
            }
            else {
                students++;
                pagesStudnets = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer>arr, int n, int m){
        if (m > n){
            return -1;
        }

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        for (int pages = low; pages <= high; pages++){
            if(cntStudents(arr, pages) == m){
                return pages;
            }
        }
        return low;
    }

    // TC - O(N*(Sum(arr[])-max(arr[])+1))
    // SC - O(1)
     */



    //---------------------------OPTIMAL---------------------------------------
    public static int cntStudents(ArrayList<Integer>arr, int pages){
        int n = arr.size();
        int students = 1;

        long pagesStudent = 0;

        for (int i = 0; i < n; i++){
            if (pagesStudent + arr.get(i) <= pages){
                pagesStudent += arr.get(i);
            }
            else {
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer>arr, int n, int m){
        if (m > n){
            return -1;
        }

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        while (low <= high){
            int mid = (low + high)/2;

            int students = cntStudents(arr, mid);

            if (students > m){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }

    // TC - O(N*log(sum(arr[])-max(arr[])+1))
    // SC - O(1)
}
