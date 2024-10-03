package Maths;

public class CheckPallindrome {


    static void pallindromeNo(int n) {
        int rev = 0;

        int dup;
        int lastDigit;
        for(dup = n; n > 0; rev = rev * 10 + lastDigit) {
            lastDigit = n % 10;
            n /= 10;
        }

        if (dup == rev) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void main(String[] args) {
        int n = 7667;
        pallindromeNo(n);
    }
}
