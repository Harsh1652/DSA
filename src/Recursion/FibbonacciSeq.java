package Recursion;

import java.util.Scanner;

public class FibbonacciSeq {
    /*
    static void printFibbonacci(int n){
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i<= n; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
     */

    static int fibbonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibbonacci(n-1) + fibbonacci(n-2);
    }

    static void printFibbonacci(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fibbonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = sc.nextInt();

        printFibbonacci(n);
    }
}
