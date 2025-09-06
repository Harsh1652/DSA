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

public class RotateLLByk {

    /* 
    //-----------------------------------BRUTE---------------------------------------------
    static Node rotateRight(Node head, int k){

        if (head == null || head.next != null) {
            return head;
        }

        for (int i = 0; i <= k; i++) {
            
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            Node end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
        // TC - O(N * K)
        // SC - O(1)
    */


    // --------------------------------OPTIMAL--------------------------
    static Node rotateLL(Node head, int k){
       
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node temp = head;
        int length = 1;

        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }

        k = k % length;
        int end = length - k;

        while (end-- != 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;


        return head;

    }

    // TC - O(length of list) + O(length of list - (length of list%k))
    // SC - O(1)


}