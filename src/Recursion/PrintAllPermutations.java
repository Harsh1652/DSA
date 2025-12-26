package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations {

    /*
    public void recurPermute(int[] nums, List<Integer> ds,
      if (ds.size() == nums.length) {
      ans.add(new ArrayList<>(ds));
      return;
      }
      
      for (int i = 0; i < nums.length; i++) {
      if (!freq[i]) {
      freq[i] = true;
      ds.add(nums[i]);
      recurPermute(nums, ds, ans, freq);
      ans.add(new ArrayList<>(ds));
      return;
      }
      
      for (int i = 0; i < nums.length; i++) {
      if (!freq[i]) {
      freq[i] = true;
      ds.add(nums[i]);
      recurPermute(nums, ds, ans, freq);
      ds.remove(ds.size() - 1);
      freq[i] = false;
      }
      }
      }
      
      public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ds = new ArrayList<>();
      boolean[] freq = new boolean[nums.length];
      recurPermute(nums, ds, ans, freq);
      return ans;
      }
      
      // TC = O(n! * n)
      // SC = O(n) + O(n)
      
     */

    void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }

}

// TC = O(n! * n)
// SC = O(n)
