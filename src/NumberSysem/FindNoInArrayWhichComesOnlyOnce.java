package NumberSysem;

public class FindNoInArrayWhichComesOnlyOnce {


    static int ans(int[] arr) {
        int unique = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int n = var2[var4];
            unique ^= n;
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(ans(arr));
    }
}
