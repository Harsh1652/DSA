package Bit_Manipulation;

import java.util.Scanner;

public class DecimalTOBinary {
    public static String DecToBin(int n){
        if (n == 0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        while (n > 0){
            binary.insert(0,n%2);
            n = n/2;
        }
        return binary.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int decNum = sc.nextInt();

        //String binaryNo = DecToBin(decNum);
        String binaryNo = Integer.toBinaryString(decNum);
        System.out.println("Binary No: "+ binaryNo);

    }
}
