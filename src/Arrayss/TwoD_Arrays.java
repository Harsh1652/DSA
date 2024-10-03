package Arrayss;

import java.util.Scanner;

public class TwoD_Arrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int col = 5;
        int x = 45;
        int[][] arr = new int[rows][col];

        int i;
        int j;
        for(i = 0; i < rows; ++i) {
            for(j = 0; j < col; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < rows; ++i) {
            for(j = 0; j < col; ++j) {
                if (arr[i][j] == x) {
                    System.out.println("X found at location: (" + i + "," + j + ")");
                }
            }
        }

    }
}
