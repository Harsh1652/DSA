package NumberSysem;

public class CalculatePower {


    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int ans;
        for(ans = 1; power > 0; power >>= 1) {
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
        }

        System.out.println(ans);
    }
}
