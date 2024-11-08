package Stack_Queue;

import java.util.Stack;

public class PostfixToInfix {
    static String postfixToInfix(String s) {

        Stack<String> st = new Stack<>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else {
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();

                String con = '(' + t2 + c + t1 + ')';

                st.push(con);
            }

        }
        return st.peek();
    }
}

// TC - O(N) + O(N)
// SC - O(N)
