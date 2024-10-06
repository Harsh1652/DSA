package Maths;

public class SpyNo {
    static boolean isSpy(int num){
        int sum = 0;
        int prod = 1;
        while (num > 0){
            int ld = num % 10;
            sum += ld;
            prod *= ld;

            num /= 10;
        }
        if (sum == prod){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 132;
        System.out.println(isSpy(num));
    }
}
