package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public Permutation() {
    }

    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList();

            for(int i = 0; i < nums.length; ++i) {
                ds.add(nums[i]);
            }

            ans.add(new ArrayList(ds));
        } else {
            for(int i = index; i < nums.length; ++i) {
                this.swap(i, index, nums);
                this.recurPermute(index + 1, nums, ans);
                this.swap(i, index, nums);
            }

        }
    }

    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        this.recurPermute(0, nums, ans);
        return ans;
    }
}
