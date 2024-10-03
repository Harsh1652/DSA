package Maths;

public class PrintAllPrimeNoTillN {
    public PrintAllPrimeNoTillN() {
    }

    static void printPrime(int n) {
        int[] prime = new int[n + 1];

        int i;
        for(i = 2; i < n; ++i) {
            prime[i] = 1;
        }

        for(i = 2; i * i <= n; ++i) {
            if (prime[i] == 1) {
                for(int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

        for(i = 2; i <= n; ++i) {
            if (prime[i] == 1) {
                System.out.println(prime[i]);
            }
        }

    }
}
