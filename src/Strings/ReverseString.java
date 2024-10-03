package Strings;

public class ReverseString {


    static void rev(char[] name, int n) {
        int s = 0;

        for(int e = n - 1; s < e; --e) {
            char temp = name[s];
            name[s] = name[e];
            name[e] = temp;
            ++s;
        }

    }

    static void reverse(String s) {
        StringBuilder str1 = new StringBuilder(s);
        str1.reverse();
        s = str1.toString();
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "Hello  Harsh Gupta";
        reverse(s);
    }
}
