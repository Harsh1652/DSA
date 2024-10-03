package Maths;

public class CheckNoIsPositiveOrNegative {


    static void posNeg(int n) {
        if (n >> 31 == 0) {
            System.out.println("" + n + "isPositive");
        } else if (n >> 31 == -1) {
            System.out.println("" + n + "is negative");
        }

    }
}
