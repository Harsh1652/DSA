package Arrayss;

import java.util.HashMap;

public class NumberofSubarrayswithxorK {
    public NumberofSubarrayswithxorK() {
    }

    public static int subarraysWithXorK(int[] a, int k) {
        int n = a.length;
        int xor = 0;
        HashMap<Integer, Integer> mpp = new HashMap();
        mpp.put(xor, 1);
        int cnt = 0;

        for(int i = 0; i < n; ++i) {
            xor ^= a[i];
            int x = xor ^ k;
            if (mpp.containsKey(x)) {
                cnt += (Integer)mpp.get(x);
            }

            if (mpp.containsKey(xor)) {
                mpp.put(xor, (Integer)mpp.get(xor) + 1);
            } else {
                mpp.put(xor, 1);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
