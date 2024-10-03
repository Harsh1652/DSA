package Maths;

import java.util.ArrayList;
import java.util.Iterator;

public class CountPrimeForRangeL_R {


    static int[] getSieve(int n) {
        int[] prime = new int[n + 1];

        int i;
        for(i = 2; i <= n; ++i) {
            prime[i] = 1;
        }

        for(i = 2; i * i <= n; ++i) {
            if (prime[i] == 1) {
                for(int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

        return prime;
    }

    static void fun(ArrayList<int[]> queries) {
        int n = (int)Math.pow(10.0, 6.0);
        int[] prime = getSieve(n);
        int cnt = 0;

        for(int i = 2; i <= n; ++i) {
            cnt += prime[i];
            prime[i] = cnt;
        }

        Iterator var8 = queries.iterator();

        while(var8.hasNext()) {
            int[] query = (int[])var8.next();
            int l = query[0];
            int r = query[1];
            System.out.println(prime[r] - prime[l - 1]);
        }

    }

    public static void main(String[] args) {
        ArrayList<int[]> queries = new ArrayList();
        queries.add(new int[]{10, 30});
        queries.add(new int[]{20, 50});
        fun(queries);
    }
}


