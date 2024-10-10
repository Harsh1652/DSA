package LinkedList;

class Node19 {
    int data;
    Node19 next;
    Node19 back;

    Node19(int data1, Node19 next1, Node19 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node19(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class RemoveDuplicatesSortedDLL {
    static Node19 RemoveDuplicates(Node19 head){
        Node19 temp = head;
        Node19 nextNode = temp.next;

        while (temp != null && temp.next!=null){
            nextNode = temp.next;

            while (nextNode != null && nextNode.data == temp.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode != null){
                nextNode.back = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    // TC - O(N)
    // SC - O(1)
}
