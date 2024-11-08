package Stack_Queue;

import java.util.Stack;

public class PrefixToPostfix {

    static String prefixToPostfix(String s){
        int n = s.length()-1;
        Stack<String> st = new Stack<>();
        for (int i = n; i <= 0; i--){
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else {
                String t1 = st.peek();
                st.pop();

                String t2 = st.peek();
                st.pop();

                st.push(t1 + t2 + c);
            }
        }
        return st.peek();
    }
}

// TC - O(2N)
// SC - O(N)
