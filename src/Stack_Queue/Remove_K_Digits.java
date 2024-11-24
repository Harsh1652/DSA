package Stack_Queue;

import java.util.Stack;

public class Remove_K_Digits {
    static String RemoveKdigits(String s, int k) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        // Traverse through the string
        for (int i = 0; i < n; i++) {
            // Remove digits from the stack if they are greater than the current digit
            // and we still have 'k' digits to remove
            while (!st.isEmpty() && k > 0 && st.peek() > s.charAt(i)) {
                st.pop();
                k--;
            }
            // Push the current digit onto the stack
            st.push(s.charAt(i));
        }

        // Remove remaining digits if k > 0
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build the result from the stack
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Reverse the result since the stack gives it in reverse order
        res.reverse();

        // Remove leading zeros
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        // If the result is empty after removing zeros, return "0"
        if (res.length() == 0) {
            return "0";
        }

        return res.toString();
    }

    // Tc - O(3N) + O(K)
    // Sc - O(N) + O(N)


}
