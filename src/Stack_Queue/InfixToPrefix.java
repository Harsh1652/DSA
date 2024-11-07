package Stack_Queue;

import java.util.Stack;

public class InfixToPrefix {

    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static String infixToPrefix(String exp) {
        StringBuilder s = new StringBuilder(exp).reverse();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == ')') {
                stack.push(c);
            }
            else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && prec(c) < prec(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return reverse(result.toString());
    }

    public static void main(String[] args) {
        String infix = "(A-B/C)*(A/K-L)";
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix expression: " + prefix);
    }
}

// TC - O(3N)
// SC - O(N)