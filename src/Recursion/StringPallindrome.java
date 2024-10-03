package Recursion;

public class StringPallindrome {

    static boolean pallindrme(String str, int i) {
        int n = str.length();
        if (i >= n / 2) {
            return true;
        } else {
            return str.charAt(i) != str.charAt(n - i - 1) ? false : pallindrme(str, i++);
        }
    }
}
