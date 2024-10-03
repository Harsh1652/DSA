package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {


    static void subseq(int ind, List<Integer> arr, List<Integer> curr) {
        int n = arr.size();
        if (ind >= n) {
            System.out.println(curr);
        } else {
            List<Integer> currWithElement = new ArrayList(curr);
            currWithElement.add((Integer)arr.get(ind));
            subseq(ind + 1, arr, currWithElement);
            subseq(ind + 1, arr, curr);
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList(List.of(1, 2, 3));
        subseq(0, arr, new ArrayList());
    }
}
