package Stack_Queue;

class QueueNode{
    int val;
    QueueNode next;

    QueueNode(int data){
        this.val = data;
        this.next = null;
    }
}

class Queue{
    QueueNode front = null, Rear = null;
    int size = 0;

    boolean Empty(){
        return front == null;
    }

    int peek(){
        if (Empty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            return front.val;
        }
    }

    void Enqueue(int value){

        QueueNode Temp = new QueueNode(value);
        if (Temp == null){
            System.out.println("Queue is full");
        }
        else {
            if (front == null){
                front = Temp;
                Rear = Temp;
            }
            else {
                Rear.next = Temp;
                Rear = Temp;
            }
            System.out.println(value + "Inserted into Queue");
            size++;
        }
    }

    void Dequeue(){
        if (front == null){
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println(front.val + "Removed from Queue");
            QueueNode Temp = front;
            front = front.next;
            size--;
        }
    }
}
public class Queue_Impl_LL {
}
