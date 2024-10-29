package Stack_Queue;

class stack{
    int size = 1000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }

    int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    int top(){
        return arr[top];
    }

    int size(){
        return top+1;
    }
}


public class Stack_Impl_Array {
    public static void main(String[] args) {

    }
}


// TC - O(N)
// SC - O(N)
