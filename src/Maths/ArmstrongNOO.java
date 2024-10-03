package Maths;

import java.util.Scanner;

public class ArmstrongNOO {

    static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;

        for (int n = num; n > 0; n /= 10) {
            int ld = n % 10;
            sum += Math.pow(ld, k);
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
