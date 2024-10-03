package Strings;

public class CalculateFreqOfCharacters {


    static void PrintFrequency(String Str) {
        int[] freq = new int[26];

        int i;
        for(i = 0; i < Str.length(); ++i) {
            ++freq[Str.charAt(i) - 97];
        }

        for(i = 0; i < 26; ++i) {
            if (freq[i] != 0) {
                System.out.println((char)(i + 97));
                System.out.println(freq[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        String str = "takeuforward";
        PrintFrequency(str);
    }
}
