package Strings;

public class FindLargestWordInString {

    static String maxLength(String str) {
        int len = str.length();
        int i = 0;
        int j = 0;
        int max_length = 0;
        int max_start = 0;
        String maxWord = "";

        while(true) {
            while(j < len) {
                if (j < len && str.charAt(j) != ' ') {
                    ++j;
                } else {
                    int curr_length = j - i;
                    if (curr_length > max_length) {
                        max_length = curr_length;
                        max_start = i;
                    }

                    ++j;
                    i = j;
                }
            }

            maxWord = str.substring(max_start, max_length);
            return maxWord;
        }
    }
}
