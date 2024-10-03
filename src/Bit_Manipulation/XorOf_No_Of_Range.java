package Bit_Manipulation;

public class XorOf_No_Of_Range {

    public static int range(int n) {
        if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return n % 4 == 3 ? 0 : n;
        }
    }

    public static void main(String[] args) {
        int start = 4;
        int end = 7;

        for(int i = start; i <= end; ++i) {
            System.out.println(range(i));
        }

    }
}
