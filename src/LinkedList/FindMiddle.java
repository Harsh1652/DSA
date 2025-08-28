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
public class FindMiddle {


    /* 
    //--------------------------------------BRUTE---------------------------------------------------
    static Node findMiddel(Node head){


        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        int cnt = 0;

        while (temp.next != null) {
            cnt++;
            temp = temp.next;
        }

        int mid = cnt / 2 + 1;
        temp = head;

        while (temp.next != null) {
            
            mid = mid - 1;

            if (mid == 0) {
                break;
            }

            temp = temp.next;
        }

        return temp;
    }
        
        //TC - O(N + N/2)
        //SC - O(1)
    */



    //---------------------------------OPTIMAL-----------------------------------------

    static Node findMiddel(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    // TC - O(N/2)
    // SC - O(1)

    
}
