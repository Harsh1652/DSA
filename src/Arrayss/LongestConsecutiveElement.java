package Arrayss;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveElement {

    public static int longestSuccessiveElement(int[] a) {
        int n = a.length;
        if (n == 0) {
            return 0;
        } else {
            int longest = 1;
            HashSet<Integer> set = new HashSet();

            for(int i = 0; i < n; ++i) {
                set.add(a[i]);
            }

            Iterator var8 = set.iterator();

            while(true) {
                int it;
                do {
                    if (!var8.hasNext()) {
                        return longest;
                    }

                    it = (Integer)var8.next();
                } while(set.contains(it - 1));

                int cnt = 1;

                for(int x = it; set.contains(x + 1); ++cnt) {
                    ++x;
                }

                longest = Math.max(longest, cnt);
            }
        }
    }
}
