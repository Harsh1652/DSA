//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Arrayss;

import java.util.HashMap;
import java.util.Map;

public class FindSubArraysWithGivenSum {


    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap();
        int preSum = 0;
        int cnt = 0;
        mpp.put(0, 1);

        for(int i = 0; i < n; ++i) {
            preSum += arr[i];
            int remove = preSum - k;
            cnt += (Integer)mpp.getOrDefault(remove, 0);
            mpp.put(preSum, (Integer)mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
