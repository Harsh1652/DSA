package Stack_Queue;

import java.util.Stack;

public class Remove_K_Digits {
    static String RemoveKdigits(String s, int k) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && k > 0 && st.peek() > s.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        res.reverse();

        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        if (res.length() == 0) {
            return "0";
        }

        return res.toString();
    }

    // Tc - O(3N) + O(K)
    // Sc - O(N) + O(N)


}
