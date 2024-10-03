package Strings;

public class ChangeCaseOfEachCharacter {

    static String solve(String str, int n) {
        StringBuffer ans = new StringBuffer();

        for(int i = 0; i < n; ++i) {
            int ascii = str.charAt(i);
            if (ascii >= 'A' && ascii <= 'Z') {
                ans.append(Character.toLowerCase((char)ascii));
            } else if (ascii >= 'a' && ascii <= 'z') {
                ans.append(Character.toUpperCase((char)ascii));
            } else if (str.charAt(i) == ' ') {
                ans.append(' ');
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "take u forward IS Awesome";
        int length = str.length();
        System.out.println("Resultant string: ");
        System.out.println(solve(str, length));
    }
}
