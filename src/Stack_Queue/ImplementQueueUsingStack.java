package Stack_Queue;

import java.util.Stack;

import Stack_Queue.ImplementStackUsingArray.stack;

public class ImplementQueueUsingStack {

    // --------------------------------------Brute
    // Force--------------------------------------
    /*
     * class queue{
     * 
     * Stack <Integer> input = new Stack<>();
     * Stack <Integer> output = new Stack<>();
     * 
     * 
     * void push(int x){
     * while(input.empty() == false){
     * output.push(input.peek());
     * input.pop();
     * }
     * System.out.println("The element pushed is " + x);
     * input.push(x);
     * 
     * while(output.empty() == false){
     * input.push(output.peek());
     * output.pop();
     * }
     * }
     * 
     * int pop(){
     * if (input.empty()) {
     * System.out.println("Stack is empty");
     * }
     * 
     * int val = input.peek();
     * input.pop();
     * return val;
     * }
     * 
     * 
     * int peek(){
     * if (input.empty()) {
     * System.out.println("Stack is empty");
     * }
     * return input.peek();
     * }
     * 
     * int size(){
     * return input.size();
     * }
     * 
     * }
     * 
     * // TC - O(N)
     * // SC - O(2N)
     */

    class queue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        void push(int x){
            System.out.println("The element pushed is " + x);
            input.push(x);
        }

        int pop() {
            if (output.empty()) {
                while (input.empty() == false) {
                    output.push(input.peek());
                    input.pop();
                }
                int x = output.peek();
                output.pop();
                return x;
            } else {
                int x = output.peek();
                output.pop();
                return x;
            }
        }

        int size() {
            return (output.size() + input.size());
        }

    }

    // TC - O(1)
    // SC - O(2N)
}
