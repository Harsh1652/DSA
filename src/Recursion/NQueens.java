package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static boolean isSafe(int row, int col, char[][] board, int n){

        // Check left in same row
        for(int j = 0; j < col; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // Check upper left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Check lower left diagonal
        for(int i = row, j = col; i < n && j >= 0; i++, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    // Backtracking function to solve N Queens 
    public static boolean solveNQueens(int col, char[][] board, List<List<String>>ans, int n){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return true;
        }
        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 'Q';
                if(solveNQueens(col + 1, board, ans, n)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        solveNQueens(0, board, ans, n);
        return ans;
    }



    
}

// TC = O(n!)
// SC = O(n^2)

