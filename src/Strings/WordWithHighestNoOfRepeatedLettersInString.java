package Strings;

public class WordWithHighestNoOfRepeatedLettersInString {


    static void HighestRepeatedLetters(String str) {
        int len = str.length();
        int maximumWord = 0;
        int curr_maximumWord ;
        String result = "";

        int right;
        for(int left = 0; left < len; left = right + 1) {
            for(right = left; right < len && str.charAt(right) != ' '; ++right) {
            }

            int[] frequency = new int[26];
            curr_maximumWord = 0;

            int index;
            for(index = left; index < right; ++index) {
                char ch = str.charAt(index);
                if (ch >= 'a' && ch <= 'z') {
                    ++frequency[ch - 97];
                } else if (ch >= 'A' && ch <= 'Z') {
                    ++frequency[ch - 65];
                }
            }

            for(index = 0; index < 26; ++index) {
                if (frequency[index] > 1) {
                    ++curr_maximumWord;
                }
            }

            if (curr_maximumWord > maximumWord) {
                maximumWord = curr_maximumWord;
                result = str.substring(left, right);
            }
        }

        if (result.equals("")) {
            System.out.println("-1");
        } else {
            System.out.println("Word with highest no of repeated letters: ");
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        String str = "abcdefg google microsoft";
        HighestRepeatedLetters(str);
    }
}
