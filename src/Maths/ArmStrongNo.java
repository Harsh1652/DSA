package Maths;

public class ArmStrongNo {


    static boolean ArmStrong(int n) {
        int dup = n;
        int newNo = 0;

        int lastDigit;
        for(int numDigits = String.valueOf(n).length(); n > 0; newNo += (int)Math.pow((double)lastDigit, (double)numDigits)) {
            lastDigit = n % 10;
            n /= 10;
        }

        if (newNo == dup) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 1634;
        ArmStrong(n);
    }
}
