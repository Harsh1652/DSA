package Stack_Queue;

import java.util.Stack;

public class Balanced_Parenthesis {

    boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{') {
                st.push(it);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch = st.pop();
                if ((it == ')' && ch == '(') || (it == ']' && ch == '[') || (it == '}' && ch == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

}
// TC - O(N)
// SC - O(N)
