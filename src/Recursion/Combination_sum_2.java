package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sum_2 {

    static void combSum(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList(ds));
        } else {
            for (int i = ind; i < arr.length; ++i) {
                if (i <= ind || arr[i] != arr[i - 1]) {
                    if (arr[i] > target) {
                        break;
                    }

                    ds.add(arr[i]);
                    combSum(i + 1, arr, target - arr[i], ans, ds);
                    ds.remove(ds.size() - 1);
                }
            }

        }
    }

    public List<List<Integer>> combinationsum2(int[] cand, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(cand);
        combSum(0, cand, target, ans, new ArrayList());
        return ans;
    }
}
