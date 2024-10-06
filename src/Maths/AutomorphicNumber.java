package Maths;

import java.util.Scanner;

public class AutomorphicNumber {

    static boolean isAutomorphic(int num) {
        int square = num * num;

        int originalNum = num;
        int numDigits = 0;

        while (originalNum > 0) {
            numDigits++;
            originalNum /= 10;
        }

        int lastDigits = square % (int) Math.pow(10, numDigits);

        return lastDigits == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
    }
}
