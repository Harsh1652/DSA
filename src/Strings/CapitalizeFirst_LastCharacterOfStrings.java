package Strings;

public class CapitalizeFirst_LastCharacterOfStrings {
    public CapitalizeFirst_LastCharacterOfStrings() {
    }

    public static String Capitalize(String str, int size) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < size; ++i) {
            if (i == 0 || i == size - 1 && str.charAt(i) >= 'a') {
                sb.setCharAt(i, (char)(str.charAt(i) - 32));
            } else if (str.charAt(i) == ' ') {
                if (str.charAt(i - 1) - 32 >= 65) {
                    sb.setCharAt(i - 1, (char)(str.charAt(i - 1) - 32));
                }

                if (str.charAt(i + 1) - 32 >= 65) {
                    sb.setCharAt(i + 1, (char)(str.charAt(i + 1) - 32));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "take u forward is awesome";
        int size = str.length();
        System.out.println("String after capitalizing the first and last letter of each word of the string: ");
        System.out.println(Capitalize(str, size));
    }
}
