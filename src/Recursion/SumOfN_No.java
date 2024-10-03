package Recursion;

public class SumOfN_No {

    static int sum(int i, int sum) {
        return i <= 1 ? sum : sum(i - 1, sum);
    }

    static int sum1(int n) {
        return n <= 1 ? 1 : n + sum1(n - 1);
    }
}
