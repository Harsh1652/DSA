package Maths;

public class SumOfAllPerfectNo_Range {
    static boolean isPerfect(int n) {
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(n); ++i) {

            if (n % i == 0) {
                sum += i;
            }

            if (i != n / i) {
                sum += n / i;
            }
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    static void CalcSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if ((isPerfect(i))) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        CalcSum(1, 1000);
    }
}
