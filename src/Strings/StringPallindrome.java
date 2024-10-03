package Strings;

import java.util.Scanner;

public class StringPallindrome {

    public static void main(String[] args) {
        char[] Str = new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int start;
        for(start = 0; start < Str.length && start < input.length(); ++start) {
            Str[start] = input.charAt(start);
        }

        start = 0;
        int end = input.length() - 1;

        boolean isPalindrome;
        for(isPalindrome = true; start < end; --end) {
            if (Str[start] != Str[end]) {
                isPalindrome = false;
                break;
            }

            ++start;
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}
