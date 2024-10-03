package Strings;

public class RemoveAllSpaces {
    public RemoveAllSpaces() {
    }

    static String Spaces(String str) {
        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                String var10000 = str.substring(0, i);
                str = var10000 + str.substring(i + 1);
                --i;
            }
        }

        return str;
    }

    static int removeSpaces(char[] str) {
        int count = 0;

        for(int i = 0; i < str.length; ++i) {
            if (str[i] != ' ') {
                str[count] = str[i];
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "take u forward";
        System.out.println("String after removing the vowels \n" + Spaces(str));
        char[] str1 = "Take you forward ".toCharArray();
        int count = removeSpaces(str1);
        System.out.println(String.valueOf(str).subSequence(0, count));
    }
}
