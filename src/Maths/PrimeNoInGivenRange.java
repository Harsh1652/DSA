package Maths;

public class PrimeNoInGivenRange {

    // Optimized prime check (skipping even numbers)
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }


        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void PrintPrime_BW_Range(int a, int b) {
        int cnt = 0;
        int sum = 0;
        for (int i = a; i <= b; i++) {

            if (isPrime(i)) {
                cnt++;
                sum+=i;
                System.out.println(i + " ");
            }
        }
        System.out.println("Total no of prime no lie between range: "+ cnt);
        System.out.println("Total sum of all prime nos is: " + sum);
    }

    public static void main(String[] args) {
        int a = 10, b = 50;
        PrintPrime_BW_Range(a, b);
    }
}
