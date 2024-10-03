package Strings;

public class ReverseWordsInStrings {

    static String result(String s) {
        int left = 0;
        int right = s.length() - 1;
        String temp = "";

        String ans;
        for(ans = ""; left <= right; ++left) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp = temp + ch;
            } else if (ch == ' ') {
                if (!ans.equals(" ")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }

                temp = "";
            }
        }

        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String st = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.print(result(st));
    }
}
