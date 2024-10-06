package Maths;

import java.util.ArrayList;
import java.util.List;

public class FindArmStrongNoInRange {
    public static boolean isArmStrong(int n){
        int power = String.valueOf(n).length();
        int sum = 0;
        for (int num = n; num > 0; num/=10){
            int ld = num%10;
            sum += Math.pow(ld,power);
        }
        return sum == n;
    }
    public static List<Integer> ArmStrong(int st, int end){
        List<Integer> Arm = new ArrayList<>();
        for (int i = st; i<=end; i++){
            if (isArmStrong(i)){
                Arm.add(i);
            }
        }
        return Arm;
    }
    public static void main(String[] args) {

    }
}
