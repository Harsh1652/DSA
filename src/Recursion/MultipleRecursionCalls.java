package Recursion;

public class MultipleRecursionCalls {

    static int fibbonacci(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fibbonacci(n-1) + fibbonacci(n-2);
        }
    }
     
}
 