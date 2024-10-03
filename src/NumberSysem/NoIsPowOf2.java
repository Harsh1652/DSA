package NumberSysem;

public class NoIsPowOf2 {


    public static void main(String[] args) {
        int n = 8;
        boolean ans = (n & n - 1) == 0;
        System.out.println(ans);
    }
}
