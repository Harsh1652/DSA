package Stack_Queue;
/*
class Stack{

    private class stackNode{
        int data;
        stackNode next;

        stackNode(int d){
            this.data = d;
            this.next = null;
        }
    }

    stackNode top;
    int size;

    Stack(){
        this.top = null;
        this.size = 0;
    }

    public void stackPush(int x){
        stackNode element = new stackNode(x);
        element.next = top;
        top = element;
        System.out.println("Element pushed");
        size++;
    }

    public int stackPop(){
        if (top == null){
            return -1;
        }

        int topData = top.data;
        stackNode temp = top;
        top = top.next;
        size--;
        return topData;
    }

    public int stackSize(){
        return size;
    }

    public boolean stackIsEmpty(){
        return top == null;
    }

    public void printStack() {
        stackNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
 */
public class Stack_Impl_LL {
    public static void main(String[] args) {

    }
}

// TC - O(1)
// SC - O(1)
