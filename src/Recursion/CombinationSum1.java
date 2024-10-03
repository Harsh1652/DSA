package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {


    static void findComb(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList(ds));
            }

        } else {
            if (arr[ind] <= target) {
                ds.add(arr[ind]);
                findComb(ind, arr, target - arr[ind], ans, ds);
                ds.remove(ds.size() - 1);
            }

            findComb(ind + 1, arr, target, ans, ds);
        }
    }

    public List<List<Integer>> CombinationSum(int[] cand, int target) {
        List<List<Integer>> ans = new ArrayList();
        findComb(0, cand, target, ans, new ArrayList());
        return ans;
    }
}
