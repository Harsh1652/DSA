package Recursion;

public class Check_Pallindrome {
    static boolean checkPallindrome(String str, int i) {
        int n = str.length();
        if (i >= n/2) {
            return true;
        }
        else if(str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }
        return checkPallindrome(str, i + 1);
    }
}
