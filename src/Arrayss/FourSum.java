package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);

        for(int i = 0; i < n; ++i) {
            if (i <= 0 || nums[i] != nums[i - 1]) {
                label69:
                for(int j = i + 1; j < n; ++j) {
                    if (j <= i + 1 || nums[j] != nums[j - 1]) {
                        int k = j + 1;
                        int l = n - 1;

                        while(true) {
                            while(true) {
                                if (k >= l) {
                                    continue label69;
                                }

                                long sum = (long)nums[i];
                                sum += (long)nums[j];
                                sum += (long)nums[k];
                                sum += (long)nums[l];
                                if (sum == (long)target) {
                                    List<Integer> temp = new ArrayList();
                                    temp.add(nums[i]);
                                    temp.add(nums[j]);
                                    temp.add(nums[k]);
                                    temp.add(nums[l]);
                                    ans.add(temp);
                                    ++k;
                                    --l;

                                    while(k < l && nums[k] == nums[k - 1]) {
                                        ++k;
                                    }

                                    while(k < l && nums[l] == nums[l + 1]) {
                                        --l;
                                    }
                                } else if (sum < (long)target) {
                                    ++k;
                                } else {
                                    --l;
                                }
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        Iterator var4 = ans.iterator();

        while(var4.hasNext()) {
            List<Integer> it = (List)var4.next();
            System.out.print("[");
            Iterator var6 = it.iterator();

            while(var6.hasNext()) {
                int ele = (Integer)var6.next();
                System.out.print("" + ele + " ");
            }

            System.out.print("] ");
        }

        System.out.println();
    }
}
