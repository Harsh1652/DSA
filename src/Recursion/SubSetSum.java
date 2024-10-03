package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum {


    static void func(int ind, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sumSubset) {
        if (ind == n) {
            sumSubset.add(sum);
        } else {
            func(ind + 1, sum + (Integer)arr.get(ind), arr, n, sumSubset);
            func(ind + 1, sum, arr, n, sumSubset);
        }
    }

    ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> sumSubset = new ArrayList();
        func(0, 0, arr, n, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
}
