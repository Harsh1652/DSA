package LinkedList;

class Node8 {
    int data;
    Node8 next;
    Node8 back;

    Node8(int data, Node8 next1, Node8 back1) {
        this.data = data;
        this.next = next1;
        this.back = back1;
    }

    Node8(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node8() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }
}
public class DeleteNthNode {


    public static Node8 DeleteNthNode(Node8 head, int n) {
        Node8 fast = head;
        Node8 slow = head;

        for(int i = 0; i < n; ++i) {
            if (fast == null) {
                return head;
            }

            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        } else {
            while(fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            return head;
        }
    }
}
