package Stack_Queue;

class Queue{
    private int arr[];
    private int start, end, currSize, maxSize;

    public Queue(){
        arr = new int[26];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public Queue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    void push(int newElement){
        if (currSize == maxSize){
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        if (end == -1){
            start = 0;
            end = 0;
        }
        else {
            end = (end + 1) % maxSize;
        }
        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currSize++;
    }

    int pop(){
        if (start == -1){
            System.out.println("Queue is Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[start];
        if (currSize == 1){
            start = -1;
            end = -1;
        }
        else{
            start = (start + 1) % maxSize;
        }
        currSize -- ;
        return popped;
    }

    int top(){
        if (start == -1){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
    public int size(){
        return currSize;
    }
}
public class Queue_Impl_Array {
    public static void main(String[] args) {

    }
}

//TC -

//  pop function: O(1)

//  push function: O(1)

//  top function: O(1)

//  size function: O(1)

// SC - O(N)
