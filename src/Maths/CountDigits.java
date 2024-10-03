package Maths;

public class CountDigits {
    public CountDigits() {
    }

    static int count(int n) {
        int count;
        for(count = 0; n > 0; n /= 10) {
            ++count;
        }

        return count;
    }

    static int count1(int n) {
        int cnt = (int)(Math.log10((double)n) + 1.0);
        return cnt;
    }

    public static void main(String[] args) {
        int n = 7789;
        System.out.println(count1(n));
        System.out.println(count(n));
    }
}
