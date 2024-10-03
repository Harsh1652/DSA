package Maths;

import java.util.ArrayList;

public class AllPrimeFactors {


    static ArrayList<Integer> getPrime(int n) {
        ArrayList<Integer> primeFactors = new ArrayList();

        for(int i = 2; i <= n; ++i) {
            if (n % i == 0) {
                primeFactors.add(i);
            }

            while(n % i == 0) {
                n /= i;
            }
        }

        return primeFactors;
    }
}
