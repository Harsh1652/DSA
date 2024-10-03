package Strings;

public class FindSubStringWithinString {

    public static void main(String[] args) {
        String text = "Take u Forward";
        String pattern = "Forward";
        int foundIdx = text.indexOf(pattern);
        System.out.println(foundIdx);
    }
}
