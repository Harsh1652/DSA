package Strings;

public class MaxOccuringCharacter {

    static char MaxOccuringChar(String str) {
        char ans = 'a';
        int maxFreq = 0;
        int n = str.length();
        int[] count = new int[256];

        for(int i = 0; i < n; ++i) {
            ++count[str.charAt(i)];
            if (count[str.charAt(i)] > maxFreq) {
                maxFreq = count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }

        return ans;
    }
}
