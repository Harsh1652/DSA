package BinarySearch;

public class NthRootNumber {

    /*
    //-----------------------------BRUTE-----------------------------------------
    public static long func(int b, int expo){
        long ans = 1;
        long base = b;

        while(expo > 0){
            if(expo % 2 == 1){
                expo--;
                ans = ans * base;
            }
            else{
                expo /= 2;
                base = base * base;
            }
        }
        return ans;
    }

    public static int NthRoot(int n, int m){
        for(int i =1; i <= m; i++){
            long val = func(i,n);

            if(val == (long)m){
                return i;
            } else if (val > (long)m) {
                break;
            }
        }
        return -1;
    }

    // TC - O(m)
    // SC - O(1)

     */


    //------------------------------BETTER-----------------------------------------

    public static int func(int mid, int n, int m){
        long ans = 1;
        for (int i = 1; i <= m; i++){
            ans = ans * mid;

            if(ans > m){
                return 2;
            }
        }
        if (ans == m){
            return 1;
        }
        return 0;
    }

    public static int Nroot (int n, int m){
        int low = 1;
        int high = m;

        while(low <= high){
            int mid = (low + high)/2;

            int midN = func(mid, n, m);

            if(midN == 1){
                return mid;
            } else if (midN == 0) {
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

    //TC - O(Nlog N)
    //SC - O(1)


}
