package Maths;


// No which is divisible by sum of its digits
public class HarshadNo {

    static boolean harshad(int num){
        int dup = num;
        int sum = 0;
        while (dup > 0){
            int ld = dup % 10;
            dup/=10;
            sum += ld;
        }
        if (num % sum == 0){
            System.out.println(num + " is a HarshadNo");
            return true;
        }
        else {
            System.out.println(num + "is not a HarshadNo");
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 18;
        harshad(n);
    }

}
