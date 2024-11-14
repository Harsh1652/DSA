package Stack_Queue;

import java.util.Stack;
import java.util.spi.LocaleNameProvider;

class Pair {
    int x, y;
    Pair(int x , int y){
        this.x = x;
        this.y = y;
    }
}
public class MinStack {

    /*
    //Meth - 1

    Stack<Pair> st = new Stack<>();

    public void push(int x){
        int min;
        if (st.isEmpty()){
            min = x;
        }
        else {
            min = Math.min(st.peek().y, x);
        }
        st.push(new Pair(x, min));
    }

    public int getMin(){
        return st.peek().y;
    }

    public int top(){
        return st.peek().x;
    }

    public void pop(){
        st.pop();
    }


    // TC - O(1)
    // SC - O(2N)
     */



    //Meth - 2

    Stack<Long> st = new Stack<Long>();
    Long mini = Long.MAX_VALUE;

    public void push(int value){
        Long val = Long.valueOf(value);
        if (st.empty()){
            mini = val;
            st.push(val);
        }
        else {
            if (val > mini){
                st.push(val);
            }
            else {
                st.push(2*val - mini);
                mini = val;
            }
        }
    }

    public void pop(){
        if (st.empty()){
            return;
        }else {
            Long x = st.peek();
            st.pop();

            if (x < mini){
                mini = 2 * mini - x;
            }
        }
    }

    public long top(){
        if (st.empty()){
            return -1;
        }
        else{
            Long x = st.peek();
            if (mini < x){
                return x;
            }
            else {
                return mini;
            }
        }
    }

    public Long getMin(){
        return mini;
    }
    // TC - O(1)
    // SC - O(N)



    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(12);
        minStack.push(15);
        System.out.println("Minimum: " + minStack.getMin());
        System.out.println("Top: " + minStack.top());

        minStack.pop();
        System.out.println("Top after pop: " + minStack.top());
        minStack.push(10);
        System.out.println("Minimum: " + minStack.getMin());

        minStack.pop();
        System.out.println("Top after pop: " + minStack.top());
        System.out.println("Minimum: " + minStack.getMin());

        minStack.pop();

    }

}
