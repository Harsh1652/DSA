
package Strings;

public class ChangeEveryLetterWithNextLexicographicAlphabet {

    public static String solve(String str) {
        StringBuffer ans = new StringBuffer();

        for(int i = 0; i < str.length(); ++i) {
            char currentChar = str.charAt(i);
            if (str.charAt(i) == 'Z') {
                ans.insert(i, 'A');
            } else if (str.charAt(i) == 'z') {
                ans.insert(i, 'a');
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                ans.append((char)(currentChar + 1));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "abcdxyz";
        System.out.println("Original string: ");
        System.out.println(str);
        System.out.println("New string: ");
        System.out.println(solve(str));
    }
}
