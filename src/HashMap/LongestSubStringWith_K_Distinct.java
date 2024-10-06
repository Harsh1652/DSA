package HashMap;
import java.util.HashMap;

public class LongestSubStringWith_K_Distinct {

    public static int longestSubstringKDistinct(String s, int k) {
        if (k == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;

        System.out.println("Longest substring with at most " + k + " distinct characters is: " + longestSubstringKDistinct(s, k));
    }
}


