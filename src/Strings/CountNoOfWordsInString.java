

package Strings;

public class CountNoOfWordsInString {

    public static void main(String[] args) {
        String str = "HI AMY AND JAY";
        int n = str.length();
        int spaces = 0;

        for(int i = 0; i < n; ++i) {
            if (str.charAt(i) == ' ') {
                ++spaces;
            }
        }

        System.out.println("No of words are: ");
        System.out.println(spaces + 1);
    }
}
