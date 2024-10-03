package Maths;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeFactorizationOfNumber {


    static void fun(ArrayList<Integer> queries) {
        int n = (int)Math.pow(10.0, 5.0);
        int[] spf = new int[n + 1];

        int i;
        for(i = 1; i <= n; spf[i] = i++) {
        }

        int j;
        for(i = 2; i * i <= n; ++i) {
            if (spf[i] == i) {
                for(j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        Iterator var6 = queries.iterator();

        while(var6.hasNext()) {
            j = (Integer)var6.next();
            int originalNum = j;
            System.out.print("Prime factors of " + originalNum + ": ");

            while(j != 1) {
                System.out.print(spf[j] + " ");
                j /= spf[j];
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> queries = new ArrayList();
        queries.add(30);
        queries.add(100);
        queries.add(99991);
        fun(queries);
    }
}
