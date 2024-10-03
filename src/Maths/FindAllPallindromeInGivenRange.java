package Maths;

public class FindAllPallindromeInGivenRange {

    static boolean isPallindrome(int n) {
        int rev = 0;

        for(int temp = n; temp > 0; temp /= 10) {
            rev = rev * 10 + temp % 10;
        }

        return n == rev;
    }
}
