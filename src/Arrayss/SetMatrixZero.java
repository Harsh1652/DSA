package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

    // Brute Force Approach
    /*
    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
         // set all non-zero elements as -1 in the row i:
        for(int j = 0; j < m; j++) {
            if(matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        // set all non-zero elements as -1 in the col j:

        for(int i = 0; i < n; i++) {
            if(matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {

        // Set -1 for rows and cols that contains 0. Don't mark any 0 as -1:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    markRow(matrix, n, m, j);
                    markCol(matrix, n, m, j);
                }
            }
        }

        // Finally, mark all -1 as 0:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    // TC - O((N*M)*(N+M))+O(N*M)
    // SC - O(1)
    */

    //----------------------------------------------

    // Better Approach
    /*
    static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row  = new int[n];
        int[] col = new int[m];

        // Traverse the matrix:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all the cells:

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    // TC - O(2*(N*M))
    // SC - O(N+M)
    */

    //----------------------------------------------

    // Optimal Approach
    
    static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int col0 = 1;

        // Traverse the matrix:
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if(j != 0) {
                        matrix.get(0).set(j, 0);
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix.get(i).get(j) != 0) {
                    // check for col and row:
                    if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        if(matrix.get(0).get(0) == 0) {
            for(int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        if(col0 == 0) {
            for(int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }

    // TC - O(2*(N*M))
    // SC - O(1)



    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = setZeroes(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

