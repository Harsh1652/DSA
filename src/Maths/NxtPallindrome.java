package Maths;

public class NxtPallindrome {

    static boolean isPallindrome(int num){
        int dup = num;
        int rev = 0;
        while (dup > 0) {
            int ld = dup % 10;
            rev = rev * 10 + ld;
            dup /= 10;
        }
        if (rev == num){
            return true;
        }
        return false;
    }

    static int NxtPallindrome(int num){
        int NxtNum = num + 1;
        while (!isPallindrome(NxtNum)){
            NxtNum++;
        }
        return NxtNum;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(NxtPallindrome(n));
    }
}

