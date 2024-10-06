package Arrayss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static String DivisibilityRule(int num){

        if (num % 3 == 0 && num % 5 == 0) {
            return "ThreeFive";
        }
        else if (num % 3 == 0){
            return "Three";
        }
        else if (num % 5 == 0){
            return "Five";
        }
        else {
            return String.valueOf(num);
        }
    }
    public static void main(String[] args) {
       int [] arr = {2,3,4,5,15};

        ArrayList<String> resultList = new ArrayList<>();
        for (int num : arr) {
            resultList.add(DivisibilityRule(num));
        }

        System.out.println(resultList);
    }
}
