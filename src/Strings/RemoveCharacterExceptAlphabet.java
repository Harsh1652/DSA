package Strings;

public class RemoveCharacterExceptAlphabet {


    static String charac(String str) {
        StringBuffer ans = new StringBuffer();

        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        int n = str.length();
        System.out.println("Resultant string:");
        System.out.println(charac(str));
    }
}
