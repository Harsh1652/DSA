package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverLappingIntervals {
    public MergeOverLappingIntervals() {
    }

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList();

        for(int i = 0; i < n; ++i) {
            if (!ans.isEmpty() && arr[i][0] <= (Integer)((List)ans.get(ans.size() - 1)).get(1)) {
                ((List)ans.get(ans.size() - 1)).set(1, Math.max((Integer)((List)ans.get(ans.size() - 1)).get(1), arr[i][1]));
            } else {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
        }

        return ans;
    }
}
