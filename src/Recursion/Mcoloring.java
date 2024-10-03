package Recursion;

import java.util.Iterator;
import java.util.List;

public class Mcoloring {


    private static boolean isSafe(int node, List<Integer>[] G, int[] color, int n, int col) {
        Iterator var5 = G[node].iterator();

        int it;
        do {
            if (!var5.hasNext()) {
                return true;
            }

            it = (Integer)var5.next();
        } while(color[it] != col);

        return false;
    }

    private static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
        if (node == n) {
            return true;
        } else {
            for(int i = 1; i <= m; ++i) {
                if (isSafe(node, G, color, n, i)) {
                    color[node] = i;
                    if (solve(node + 1, G, color, n, m)) {
                        return true;
                    }

                    color[node] = 0;
                }
            }

            return false;
        }
    }

    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int m) {
        int n = G.length;
        return solve(0, G, color, n, m);
    }
}
