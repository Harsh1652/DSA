package Recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class N_Queens {
    public N_Queens() {
    }

    public static List<List<String>> SolveNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList();
        int[] leftRow = new int[n];
        int[] upperDiag = new int[2 * n - 1];
        int[] lowerDiag = new int[2 * n - 1];
        solve(0, board, res, leftRow, lowerDiag, upperDiag);
        return res;
    }

    static void solve(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] lowerDiag, int[] upperDiag) {
        if (col == board.length) {
            res.add(construct(board));
        } else {
            for(int row = 0; row < board.length; ++row) {
                if (leftRow[row] == 0 && lowerDiag[row + col] == 0 && upperDiag[board.length - 1 + col - row] == 0) {
                    board[row][col] = 'Q';
                    leftRow[row] = 1;
                    lowerDiag[row + col] = 1;
                    upperDiag[board.length - 1 + col - row] = 1;
                    solve(col + 1, board, res, leftRow, lowerDiag, upperDiag);
                    board[row][col] = '.';
                    leftRow[row] = 0;
                    lowerDiag[row + col] = 0;
                    upperDiag[board.length - 1 + col - row] = 0;
                }
            }

        }
    }

    static List<String> construct(char[][] board) {
        List<String> res = new LinkedList();

        for(int i = 0; i < board.length; ++i) {
            String s = new String(board[i]);
            res.add(s);
        }

        return res;
    }

    public static void main(String[] args) {
        int N = 4;
        List<List<String>> queen = SolveNQueens(N);
        int i = 1;

        for(Iterator var4 = queen.iterator(); var4.hasNext(); ++i) {
            List<String> it = (List)var4.next();
            System.out.println("Arrangement " + i);
            Iterator var6 = it.iterator();

            while(var6.hasNext()) {
                String s = (String)var6.next();
                System.out.println(s);
            }

            System.out.println();
        }

    }
}
