package LinkedList;
class Node15{
    int num ;
    Node15 next;

    Node15(int val, Node15 next1){
        this.num = val;
        this.next = next1;
    }

    Node15(int val){
        this.num = val;
        this.next = null;
    }

}
public class DeleteMiddleNode {
    /*
    //----------------------------Brute Force--------------------------------------------------------
    static Node15 deleteMiddleNode(Node15 head){
        Node15 temp = head;
        int n = 0;
        if (head == null || head.next == null) {
            return null;
        }
        while (temp != null){
            n++;
            temp = temp.next;
        }
        int res = n/2;
        temp = head;
        while (temp != null){
            res--;
            if (res == 0){
                Node15 middle = temp.next;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // TC - O(N + N/2)
    // SC - O(1)
     */


    //-----------------------------Optimized Approach--------------------------------------
    static Node15 deleteMiddleNode(Node15 head){
        Node15 slow = head;
        Node15 fast = head;

        fast = fast.next.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
     // TC - O(N/2)
     // SC - O(1)
}
