package Strings;

public class MaxOccuringChar {


    static char getMaxOccuringChar(String s) {
        int[] arr = new int[26];

        int max;
        int ans;
        int i;
        for(max = 0; max < s.length(); ++max) {
            ans = s.charAt(max);
            boolean n = false;
            if (ans >= 97 && ans <= 122) {
                i = ans - 97;
            } else {
                i = ans - 65;
            }

            int var10002 = arr[i]++;
        }

        max = -1;
        ans = -1;

        for(i = 0; i < arr.length; ++i) {
            if (max < arr[i]) {
                max = arr[i];
                ans = i;
            }

            max = Math.max(max, arr[i]);
        }

        return (char)(97 + ans);
    }

    public static void main(String[] args) {
        String s = "HelloHarshSakhuniya";
        char maxChar = getMaxOccuringChar(s);
        System.out.println("The maximum occurring character is: " + maxChar);
    }
}
