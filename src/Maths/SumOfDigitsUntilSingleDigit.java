package Maths;

import java.util.Scanner;

public class SumOfDigitsUntilSingleDigit {


    /*
    static int sumOfDigitsUntilSingleDigit(int num) {
        while (num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }
     */

    static int sumOfDigitsUntilSingleDigit(int num) {
        if (num == 0) {
            return 0;
        }

        if (num % 9 == 0) {
            return 9;
        }

        return num % 9;
    }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfDigitsUntilSingleDigit(num);

        System.out.println("The sum of digits until a single digit is: " + result);
    }
}
