package Strings;

public class CountNoOfVowels_Const_Spaces {

    static void solve(String s) {
        int vowels = 0;
        int cont = 0;
        int whiteSpaces = 0;
        s = s.toLowerCase();

        for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                if (ch >= 'a' && ch <= 'z') {
                    ++cont;
                } else if (ch == ' ') {
                    ++whiteSpaces;
                }
            } else {
                ++vowels;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cont);
        System.out.println("White spaces: " + whiteSpaces);
    }

    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        int length = str.length();
        solve(str);
    }
}
