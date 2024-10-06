package Maths;

import java.util.Scanner;

public class PerfectNo {

    static boolean isPerfect(int n) {
        int sum = 1;

        for(int i = 2; i<= Math.sqrt(n); ++i) {

            if (n % i == 0){
                sum += i;
            }

            if (i != n/i){
                sum+=n/i;
            }
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no you want to check: ");
        int num = sc.nextInt();
        System.out.println(isPerfect(num));
    }
}
