public class test {
    public static String reverse(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "This is a test";
        String output = reverse(input);
        System.out.println(output);
    }
}
