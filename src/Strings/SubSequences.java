package Strings;

public class SubSequences {

    public static void main(String[] args) {
        subSequences("", "abc");
    }

    static void subSequences(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
        } else {
            char ch = up.charAt(0);
            subSequences(p + ch, up.substring(1));
            subSequences(p, up.substring(1));
        }
    }
}
