package Recursion;

public class fibbonacci {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            int last = fib(n - 1);
            int secondLast = fib(n - 2);
            return last + secondLast;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci number " + n + " is: " + fib(n));
    }
}
