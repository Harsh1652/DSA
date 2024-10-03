

package Maths;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {


    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> l1 = new ArrayList();

        for(int i = 1; i * i <= n; ++i) {
            if (n % i == 0) {
                l1.add(i);
                if (n / i != i) {
                    l1.add(n / i);
                }
            }
        }

        Collections.sort(l1);
        System.out.println(l1);
    }
}
