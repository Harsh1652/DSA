package Bit_Manipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int BinToDec(String num){
        int decimal = 0;
        int power = 0;

        for (int i = num.length() - 1; i >= 0; i--){
            char bit = num.charAt(i);
            if (bit == 1){
                decimal += Math.pow(2,power);
            }
            power++;
        }
        return decimal;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String binaryNo = sc.nextLine();

    /*
    // Using BuiltIn Meathod
    int decNo = Integer.parseInt(binaryNo,2);
    System.out.println(decNo);
     */
}
}
