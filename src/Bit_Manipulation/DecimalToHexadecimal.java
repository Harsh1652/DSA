package Bit_Manipulation;

public class DecimalToHexadecimal {

    static String toHexadecimal(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();
        while (num > 0){
            int remainder = num % 16;
            if (remainder < 10){
                hex.append((char) (remainder + '0'));
            }
            else {
                hex.append((char) (remainder - 10 + 'A'));
            }
            num /= 16;
        }
        return hex.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 123;
        String hexaNo = toHexadecimal(num);
        System.out.println("The hexadecimal representation of " + num + " is: " + hexaNo);
    }
}
