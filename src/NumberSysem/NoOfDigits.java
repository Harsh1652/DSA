

package NumberSysem;

public class NoOfDigits {


    public static void main(String[] args) {
        int n = 5;
        int b = 10;
        int ans = (int)(Math.log((double)n) / Math.log((double)b)) + 1;
        System.out.println(ans);
    }
}
