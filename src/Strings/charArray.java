package Strings;

import java.util.Scanner;

public class charArray {

    public static void main(String[] args) {
        char[] name = new char[15];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for(int i = 0; i < input.length() && i < name.length; ++i) {
            name[i] = input.charAt(i);
        }

        System.out.println("Character Array:");
        char[] var8 = name;
        int var5 = name.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            char c = var8[var6];
            System.out.print("" + c + " ");
        }

        System.out.println();
        System.out.println(input.length());
    }
}
