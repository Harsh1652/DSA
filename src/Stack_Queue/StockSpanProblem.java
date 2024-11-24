package Stack_Queue;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {

    /*
    // Brute Force Approach

    private ArrayList<Integer> arr;

    public StockSpanProblem() {
        arr = new ArrayList<>();
    }

    public int Next(int val) {
        arr.add(val);
        int cnt = 1;

        // Traverse backwards to calculate the span
        for (int i = arr.size() - 2; i >= 0; i--) {
            if (arr.get(i) <= val) {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
     */


    class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    public class StockSpanner {
        private Stack<Pair> st;
        private int ind;
        public StockSpanner() {
            st = new Stack<>();
            ind = -1;
        }
        public int next(int val) {
            ind++;
            while (!st.isEmpty() && st.peek().value <= val) {
                st.pop();
            }
            int span = st.isEmpty() ? ind + 1 : ind - st.peek().index;
            st.push(new Pair(val, ind));
            return span;
        }
    }
    // TC - O(2N)
    // SC - O(N)
}
