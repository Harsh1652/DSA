package Stack_Queue;

import java.util.Stack;

public class PostfixToPrefix {
    static String postfixToprefix(String s){

        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else {
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();

                st.push(c + t2 + t1);
            }
        }
        return st.peek();
    }
}

// TC - O(2N)
// SC - O(N)
