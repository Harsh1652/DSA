
package Maths;

public class RevNo {

    public static void main(String[] args) {
        int n = 778900;

        int rev;
        int lastDigit;
        for(rev = 0; n > 0; rev = rev * 10 + lastDigit) {
            lastDigit = n % 10;
            n /= 10;
        }

        System.out.println(rev);
    }
}
