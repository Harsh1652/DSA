package Maths;

import java.util.Scanner;

public class SumOfAllCubes {
    static void SumCube(int a, int b){
        int sum = 0;
        for (int i = a; i<= b; i++){
            int cube = i*i*i;
            sum += cube;
        }
        System.out.println("Sum of cubes from " + a + " to " + b + " is: " + sum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the ending number (b): ");
        int b = sc.nextInt();

        SumCube(a, b);

    }
}
