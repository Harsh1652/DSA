package Maths;

import java.util.Scanner;

public class LCM {
    static int gcd(int num1, int num2){
        while (num1 > 0 && num2 > 0){
            if (num1 > num2){
                num1 %= num2;
            }else {
                num2 %= num1;
            }
        }
        if (num1 > 0){
            return num1;
        }
        return num2;
    }
    static int LCM(int num1, int num2){
        int lcm = num1 * num2 / gcd(num1, num2);
        System.out.println(lcm);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        LCM(num1,num2);
    }
}
