package Arrayss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PascalTriangle {
    public PascalTriangle() {
    }

    public static int nCr(int n, int r) {
        long res = 1L;

        for(int i = 0; i < r; ++i) {
            res *= (long)(n - i);
            res /= (long)(i + 1);
        }

        return (int)res;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList();

        for(int row = 1; row <= n; ++row) {
            List<Integer> tempLst = new ArrayList();

            for(int col = 1; col <= row; ++col) {
                tempLst.add(nCr(row - 1, col - 1));
            }

            ans.add(tempLst);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        Iterator var3 = ans.iterator();

        while(var3.hasNext()) {
            List<Integer> it = (List)var3.next();
            Iterator var5 = it.iterator();

            while(var5.hasNext()) {
                int ele = (Integer)var5.next();
                System.out.print("" + ele + " ");
            }

            System.out.println();
        }

    }
}
