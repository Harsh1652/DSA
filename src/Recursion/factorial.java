package Recursion;

public class factorial {


    static int fac(int n) {
        return n != 0 && n != 1 ? n * fac(n - 1) : 1;
    }
}
