package Arrayss;

public class MarkAllZeroes {
    public MarkAllZeroes() {
    }

    public static int[][] zeroMatrix(int[][] matrix, int n, int m) {
        boolean col0 = true;

        int i;
        int j;
        for(i = 0; i < n; ++i) {
            for(j = 0; j < m; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = false;
                    }
                }
            }
        }

        for(i = 1; i < n; ++i) {
            for(j = 1; j < m; ++j) {
                if (matrix[i][j] != 0 && (matrix[i][0] == 0 || matrix[0][j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for(i = 0; i < m; ++i) {
                matrix[0][i] = 0;
            }
        }

        if (!col0) {
            for(i = 0; i < n; ++i) {
                matrix[i][0] = 0;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = zeroMatrix(matrix, n, m);
        System.out.println("The Final matrix is: ");

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.print(ans[i][j] + " ");
            }

            System.out.println();
        }

    }
}
