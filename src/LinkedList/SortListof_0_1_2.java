package LinkedList;

class Node7 {
    int data;
    Node7 next;
    Node7 back;

    Node7(int data, Node7 next1, Node7 back1) {
        this.data = data;
        this.next = next1;
        this.back = back1;
    }

    Node7(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    Node7() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }
}

public class SortListof_0_1_2 {


    public static Node7 SortList(Node7 head) {
        if (head != null && head.next != null) {
            Node7 zerohead = new Node7(-1);
            Node7 onehead = new Node7(-1);
            Node7 twohead = new Node7(-1);
            Node7 zero = zerohead;
            Node7 one = onehead;
            Node7 two = twohead;

            for(Node7 temp = head; temp != null; temp = temp.next) {
                if (temp.data == 0) {
                    zero.next = temp;
                    zero = temp;
                }

                if (temp.data == 1) {
                    one.next = temp;
                    one = temp;
                } else {
                    two.next = temp;
                    two = temp;
                }
            }

            zero.next = onehead.next != null ? onehead.next : twohead.next;
            one.next = twohead.next;
            two.next = null;
            head = zerohead.next;
            return head;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
    }
}
