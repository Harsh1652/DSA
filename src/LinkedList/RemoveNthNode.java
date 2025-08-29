package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next; 
    }

    Node(int data){
        this.data = data;
    }
}

public class RemoveNthNode {
    
    /* 
    //---------------------------------------BRUTE-----------------------------------------------
    static Node RemoveNthNode(Node head, int N){

        if (head == null){
            return null; 
        }

        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == N){

            Node newHead = head.next;
            head = null;
            return newHead;
            
        }

        int res = cnt - N;
        temp = head;

        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        Node delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;

        // TC - O(L) + O(L-N)
        // SC - O(1)
    }
    */


    //------------------------------------------------------OPTIMAL------------------------------------
    static Node RemoveNthNode(Node head, int N){

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next !=  null) {
            fast = fast.next;
            slow = slow.next;
        }

        Node delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;

        // TC - O(N)
        // SC - O(1)
    }



}
