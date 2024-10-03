package Arrayss;

import java.util.Scanner;

public class one {
    public one() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = 45;
        int[] number = new int[size];

        int i;
        for(i = 0; i < size; ++i) {
            number[i] = sc.nextInt();
        }

        for(i = 0; i < size; ++i) {
            if (number[i] == x) {
                System.out.println(i);
                break;
            }
        }

        for(i = 0; i < size; ++i) {
            System.out.println(number[i]);
        }

    }
}
