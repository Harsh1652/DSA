package Arrayss;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public SpiralMatrix() {
    }

    public static List<Integer> matrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        ArrayList<Integer> list = new ArrayList();

        while(top <= bottom && left <= right) {
            int i;
            for(i = left; i <= right; ++i) {
                list.add(mat[top][i]);
            }

            ++top;

            for(i = top; i <= bottom; ++i) {
                list.add(mat[i][right]);
            }

            --right;
            if (top <= bottom) {
                for(i = right; i >= left; --i) {
                    list.add(mat[bottom][i]);
                }

                --bottom;
            }

            if (left <= right) {
                for(i = bottom; i >= top; --i) {
                    list.add(mat[i][left]);
                }

                ++left;
            }
        }

        return list;
    }
}
