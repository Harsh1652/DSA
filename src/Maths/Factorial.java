package Maths;

public class Factorial {


    int factorial(int n) {
        return n == 0 ? 1 : n * this.factorial(n - 1);
    }
}
