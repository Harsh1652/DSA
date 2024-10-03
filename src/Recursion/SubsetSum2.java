package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2 {


    public static void findSubset(int ind, int[] nums, ArrayList<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList(ds));

        for(int i = ind; i < nums.length; ++i) {
            if (i == ind || nums[i] != nums[i - 1]) {
                ds.add(nums[i]);
                findSubset(i + 1, nums, ds, ansList);
                ds.remove(ds.size() - 1);
            }
        }

    }

    public List<List<Integer>> SubsetWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList();
        findSubset(0, nums, new ArrayList(), ansList);
        return ansList;
    }
}
