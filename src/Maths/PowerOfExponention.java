package Maths;

public class PowerOfExponention {


    static int expo(int x, int n) {
        int ans = 1;

        while(n > 0) {
            if (n % 2 == 1) {
                ans *= x;
                --n;
            } else {
                n /= 2;
                x *= x;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(expo(2, 5));
    }
}
