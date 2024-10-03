package Strings;

public class PrintDuplicates {


    public static void main(String[] args) {
        String str = "Sinstriiintg";
        int[] counts = new int[26];
        str = str.toLowerCase();

        int i;
        for(i = 0; i < str.length(); ++i) {
            char currentChar = str.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                ++counts[currentChar - 97];
            }
        }

        for(i = 0; i < 26; ++i) {
            if (counts[i] > 1) {
                System.out.println((char)(i + 97) + " - " + counts[i]);
            }
        }

    }
}
