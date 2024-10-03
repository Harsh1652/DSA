package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Kth_Permutation {

    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList();

        for(int i = 1; i < n; ++i) {
            fact *= i;
            numbers.add(i);
        }

        numbers.add(n);
        String ans = "";
        --k;

        while(true) {
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                return ans;
            }

            k %= fact;
            fact /= numbers.size();
        }
    }
}
