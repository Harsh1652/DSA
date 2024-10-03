package Strings;

public class RemoveDuplicates {


    static String removeDuplicates(String s) {
        String ans = " ";
        boolean[] map = new boolean[26];

        for(int i = 0; i < s.length(); ++i) {
            if (!map[s.charAt(i) - 97]) {
                ans = ans + s.charAt(i);
                map[s.charAt(i) - 97] = true;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println("Original String: " + str + "\nAfter removing duplicates: " + removeDuplicates(str));
    }
}
