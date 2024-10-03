package Arrayss;

import java.util.ArrayList;
import java.util.Collections;

public class ReaarangeBySign {


    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList(Collections.nCopies(n, 0));
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < n; ++i) {
            if ((Integer)A.get(i) < 0) {
                ans.set(negIndex, (Integer)A.get(i));
                negIndex += 2;
            } else {
                ans.set(posIndex, (Integer)A.get(i));
                posIndex += 2;
            }
        }

        return ans;
    }

    public static ArrayList<Integer> RearrangebySign1(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList();
        ArrayList<Integer> neg = new ArrayList();

        int index;
        for(index = 0; index < n; ++index) {
            if ((Integer)A.get(index) > 0) {
                pos.add((Integer)A.get(index));
            } else {
                neg.add((Integer)A.get(index));
            }
        }

        int i;
        if (pos.size() < neg.size()) {
            for(index = 0; index < pos.size(); ++index) {
                A.set(2 * index, (Integer)pos.get(index));
                A.set(2 * index + 1, (Integer)neg.get(index));
            }

            index = pos.size() * 2;

            for(i = pos.size(); i < neg.size(); ++i) {
                A.set(index, (Integer)neg.get(i));
                ++index;
            }
        } else {
            for(index = 0; index < neg.size(); ++index) {
                A.set(2 * index, (Integer)pos.get(index));
                A.set(2 * index + 1, (Integer)neg.get(index));
            }

            index = neg.size() * 2;

            for(i = neg.size(); i < pos.size(); ++i) {
                A.set(index, (Integer)pos.get(i));
                ++index;
            }
        }

        return A;
    }
}
