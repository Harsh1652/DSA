package Stack_Queue;

import java.util.Stack;

public class InfixToPostfix {

    static int prec(char ch){
        switch (ch){
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

    static String infixToPostfix(String exp){
        String result = new String("");
        Stack<Character> Stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)){
                result +=c;
            }
            else if (c == '('){
                Stack.push(c);
            }
            else if (c == ')') {
                while (!Stack.isEmpty() &&
                        Stack.peek() != '(') {
                    result += Stack.pop();
                }
                Stack.pop();
            }
            else {
                while (Stack.isEmpty() && prec(c) <= prec(Stack.peek())){
                    result += Stack.pop();
                }
            }
            Stack.push(c);
        }
        while (!Stack.isEmpty()) {
            if (Stack.peek() == '(')
                return "Invalid Expression";
            result += Stack.pop();
        }
        return result;
    }
}
