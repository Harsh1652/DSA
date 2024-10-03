package Maths;

public class CheckWeatherNoIsEvenOrOdd {

    static int solve(int n) {
        return (n & 1) == 0 ? 0 : 1;
    }
}
