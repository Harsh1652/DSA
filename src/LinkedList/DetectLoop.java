package LinkedList;

import java.util.HashMap;

class Node13{
    int num;
    Node13 next;

    Node13(int val, Node13 next1){
        this.num = val;
        this.next = next1;
    }
    Node13(int val){
        this.num = val;
        this.next = null;
    }
}
public class DetectLoop {

    static Node13 insertion(Node13 head, int data){
        Node13 newNode = new Node13(data);

        if (head == null){
            head = newNode;
            return head;
        }

        Node13 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static void PrintLL(Node12 head){
        while (head.next != null){
            System.out.println(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    /*
   //---------------------------Brute Force-------------------------------------------
    static boolean detectLoop(Node13 head){
        Node13 temp = head;
        HashMap<Node13, Integer> mpp = new HashMap<>();
        while (temp != null){

            if (mpp.containsKey(temp)){
                return true;
            }
            mpp.put(temp,1);

            temp = temp.next;
        }
        return false;
    }

    // TC - O(N*2*log(N))
    // SC - O(N)
     */

    /*
    //--------------------------------Optimized Approach--------------------------------------------
    static boolean detectLoop(Node13 head){
        Node13 slow = head;
        Node13 fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    // TC - O(N)
    // SC - O(1)
     */
}
