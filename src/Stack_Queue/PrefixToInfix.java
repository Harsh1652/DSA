package Stack_Queue;

import java.util.Stack;

public class PrefixToInfix {
    static String prefixTopostfix(String s){

        Stack<String> st = new Stack<>();
        int n = s.length()-1;

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

                String con = '(' + t1 + c + t2 + ')';

                st.push(con);
            }
        }
        return st.peek();
    }
}

// TC - O(2N)
// SC - O(N)
