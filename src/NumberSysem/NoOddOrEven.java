package NumberSysem;

public class NoOddOrEven {

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }
}
