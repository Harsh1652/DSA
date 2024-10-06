package Maths;

public class CheckPallindrome {


    static boolean pallindromeNo(int n) {
        int rev = 0;
        int dup = n;
        int lastDigit;
        while (dup > 0){
            lastDigit = dup % 10;
            rev = rev * 10 + lastDigit;
            dup/=10;
        }

        return rev == n;
    }

    public static void main(String[] args) {
        int n = 1661;
        if(pallindromeNo(n)){
            System.out.println("This no is Pallindrome");
        }
        else {
            System.out.println("Not a Pallindrome no");
        }
    }
}
