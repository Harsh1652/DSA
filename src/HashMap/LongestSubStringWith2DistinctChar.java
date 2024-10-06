package HashMap;
import java.util.HashMap;

public class LongestSubStringWith2DistinctChar {

     public static int longestSubstringWithTwoDistinctChars(String s) {
         int n = s.length();
         if (n < 2) {
             return n;  // If the length of string is less than 2, return the length of the string
         }

         HashMap<Character, Integer> charCount = new HashMap<>();
         int left = 0, maxLength = 0;

         for (int right = 0; right < n; right++) {
             charCount.put(s.charAt(right), charCount.getOrDefault(s.charAt(right), 0) + 1);

             while (charCount.size() > 2) {
                 char leftChar = s.charAt(left);
                 charCount.put(leftChar, charCount.get(leftChar) - 1);
                 if (charCount.get(leftChar) == 0) {
                     charCount.remove(leftChar);
                 }
                 left++;
             }

             maxLength = Math.max(maxLength, right - left + 1);
         }

         return maxLength;
     }

     public static void main(String[] args) {
         String s = "eceba";
         int result = longestSubstringWithTwoDistinctChars(s);
         System.out.println("The length of the longest substring with exactly 2 distinct characters is: " + result);
     }
}


