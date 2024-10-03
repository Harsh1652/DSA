package Strings;

public class NonRepeatingCharacters {


    static void PrintFreq(String st, int n) {
        int[] freq = new int[200];
        char[] s = st.toCharArray();

        int i;
        for(i = 0; i < n; ++i) {
            if (st.charAt(i) != ' ') {
                ++freq[st.charAt(i)];
            }
        }

        for(i = 0; i < n; ++i) {
            if (freq[st.charAt(i)] == 1 && s[i] != ' ') {
                System.out.println(s[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        String st = "take u forward";
        int n = st.length();
        System.out.print("Non-Repeating characters: ");
        PrintFreq(st, n);
    }
}
