package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public ThreeSum() {
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        HashSet<List<Integer>> set = new HashSet();
        int n = arr.length;
        Arrays.sort(arr);

        label56:
        for(int i = 0; i < n; ++i) {
            if (i <= 0 || arr[i] != arr[i - 1]) {
                int j = i + 1;
                int k = n - 1;

                while(true) {
                    while(true) {
                        if (j >= k) {
                            continue label56;
                        }

                        int sum = arr[i] + arr[j] + arr[k];
                        if (sum < 0) {
                            ++j;
                        } else if (sum > 0) {
                            --k;
                        } else {
                            List<Integer> temp = new ArrayList();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            set.add(temp);
                            ++j;
                            --k;

                            while(j < k && arr[j] == arr[j - 1]) {
                                ++j;
                            }

                            while(j < k && arr[k] == arr[k + 1]) {
                                --k;
                            }
                        }
                    }
                }
            }
        }

        return new ArrayList(set);
    }
}
