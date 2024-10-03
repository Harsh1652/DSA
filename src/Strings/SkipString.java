package Strings;

public class SkipString {


    public static void main(String[] args) {
        System.out.println(skip("bccdapplebcd"));
    }

    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        } else if (up.startsWith("apple")) {
            return skip(up.substring(5));
        } else {
            char var10000 = up.charAt(0);
            return "" + var10000 + skip(up.substring(1));
        }
    }

    public static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        } else if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            char var10000 = up.charAt(0);
            return "" + var10000 + skipAppNotApple(up.substring(1));
        }
    }
}
