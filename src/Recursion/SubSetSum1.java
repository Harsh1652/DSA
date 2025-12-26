package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum1 {

    void func(int ind, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sumSubset) {
        if (ind == n) {
            sumSubset.add(sum);
            return;
        }
        func(ind + 1, sum + arr.get(ind), arr, n, sumSubset);
        func(ind + 1, sum, arr, n, sumSubset);
    }

    ArrayList<Integer> SubsetSum(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, n, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

}
