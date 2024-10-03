package Maths;

public class PerfectNo {

    static boolean isPerfect(int n) {
        int sum = 0;

        for(int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                if (i * i != n && i != 1) {
                    sum = sum + i + n / i;
                } else {
                    sum += i;
                }
            }
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
