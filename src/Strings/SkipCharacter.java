package Strings;

public class SkipCharacter {

    public static void main(String[] args) {
        skip("baccad");
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        } else {
            char ch = up.charAt(0);
            return ch == 'a' ? skip(up.substring(1)) : skip("" + ch + up.substring(1));
        }
    }
}
