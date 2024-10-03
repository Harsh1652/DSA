package Strings;

import java.util.HashMap;

public class RemoveCommonCharacters {


    static String Solve(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap();
        StringBuffer ans = new StringBuffer();

        int i;
        for(i = 0; i < str2.length(); ++i) {
            map.put(str2.charAt(i), 1);
        }

        for(i = 0; i < str1.length(); ++i) {
            if (map.get(str1.charAt(i)) == null) {
                ans.append(str1.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cefz";
        System.out.println("Final string 1:");
        System.out.println(Solve(str1, str2));
    }
}
