package Strings;

public class RemoveVowelsFromString {


    static String Vowels(String str) {
        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                String var10000 = str.substring(0, i);
                str = var10000 + str.substring(i + 1);
                --i;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        String str = "take u forward";
        System.out.println("String after removing the vowels \n" + Vowels(str));
    }
}
