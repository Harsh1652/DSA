package Strings;

public class AnagramString {
    public AnagramString() {
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int[] freq = new int[26];

            int i;
            for(i = 0; i < str1.length(); ++i) {
                ++freq[str1.charAt(i) - 65];
            }

            for(i = 0; i < str2.length(); ++i) {
                --freq[str2.charAt(i) - 65];
            }

            for(i = 0; i < 26; ++i) {
                if (freq[i] != 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagram(Str1, Str2));
    }
}
