package Stack_Queue;

import Stack_Queue.ImplementQueueUsingArray.queue;

public class ImplementStackUsingQueue {

    class stack{
        Queue <Integer> q = new LinkedList<>();

        void push(int x){
            q.add(x);
            for (int i = 0; i < q.size(); i++){
                q.add(q.remove());
            }
        }

        int pop(){
            return q.remove();
        }

        int top(){
            return q.peek();
        }

        int size(){
            return q.size();
        }

    }
}

// TC - O(N)
// SC - O(N)