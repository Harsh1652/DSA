package Maths;

public class PrimeNoInGivenRange {


    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        } else {
            for(int i = 2; (double)i < Math.sqrt((double)num); ++i) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    static void PrintPrime_BW_Range(int a, int b) {
        for(int i = a; i <= b; ++i) {
            if (isPrime(i)) {
                System.out.println("" + i + " ");
            }
        }

    }
}
