package Strings;

import java.io.PrintStream;

public class ValidPallindrome {

    public boolean valid(char ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9';
    }

    public char toLowerCase(char ch) {
        return ch >= 'A' && ch <= 'Z' ? (char)(ch + 97 - 65) : ch;
    }

    public boolean isPalindrome(String s) {
        int start = 0;

        for(int end = s.length() - 1; start < end; --end) {
            while(start < end && !this.valid(s.charAt(start))) {
                ++start;
            }

            while(start < end && !this.valid(s.charAt(end))) {
                --end;
            }

            if (this.toLowerCase(s.charAt(start)) != this.toLowerCase(s.charAt(end))) {
                return false;
            }

            ++start;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPallindrome vp = new ValidPallindrome();
        String s = "A man, a plan, a canal: Panama";
        PrintStream var10000 = System.out;
        boolean var10001 = vp.isPalindrome(s);
        var10000.println("Is the string a valid palindrome? " + var10001);
    }
}
