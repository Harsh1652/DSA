package Stack_Queue;

import java.util.Stack;
import java.util.logging.LogManager;

/* 
    //----------------------------------Brute Force----------------------------------
class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    class MinStack {
        Stack<Pair> st = new Stack<>();

        public MinStack() {
            st = new Stack<>();
        }

        public void push(int x) {
            int min;
            if (st.isEmpty()) {
                min = x;
            }
            else {
                min = Math.min(st.peek().y, x);
            }
            st.push(new Pair(x, min));
        }

        public void pop() {
            st.pop();
        }

        public int top() {
            return st.peek().x;
        }

        public int getMin() {
            return st.peek().y;
        }
    }

    //TC - O(1)
    //SC - O(2N)
}
    */

class MinStack {
    Stack<Long> st = new Stack<Long>();
    Long mini;

    public void minStack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.empty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);
                mini = val;
            } else {
                st.push(val);
            }
        }
    }

    public void pop() {
        if (st.empty()) {
            return;
        }

        Long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val;
        }
    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }
}

// TC - O(1)
// SC - O(N)
