package LinkedList;

class Node5 {
    int data;
    Node5 next;
    Node5 back;

    Node5(int data1, Node5 next1, Node5 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node5(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    Node5() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }
}

public class RevDLL {

    public static Node5 reverseDll(Node5 head) {
        if (head != null && head.next != null) {
            Node5 prev = null;

            Node5 temp;
            for(Node5 current = head; current != null; current = temp) {
                temp = current.next;
                current.next = prev;
                current.back = temp;
                prev = current;
            }

            return prev;
        } else {
            return head;
        }
    }
}
