

package Strings;

public class RemoveBrackets {


    static String Solve(String str) {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != '(' && str.charAt(i) != ')') {
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String input1 = "a+((b-c)+d)";
        String input2 = "(((a-b))+c)";
        System.out.println("Original String: " + input1);
        System.out.println("After removing brackets: " + Solve(input1));
        System.out.println("Original String: " + input2);
        System.out.println("After removing brackets: " + Solve(input2));
    }
}
