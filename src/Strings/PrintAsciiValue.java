package Strings;

public class PrintAsciiValue {

    public static void value() {
        char c = 'a';
        int ascii = (byte)c;
        System.out.println("The ASCII value of " + c + " is: " + ascii);
    }

    public static void main(String[] args) {
        value();
    }
}
