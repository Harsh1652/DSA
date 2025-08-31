package LinkedList;

import java.util.HashMap;
import java.util.Map;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DetectCycle {
    
    /* 
    -------------------------------------------BRUTE------------------------------------
    static boolean detectLoop(Node head){
        Node temp = head;
        Map<Node, int> nodeMap = new HashMap<>();

        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return true;
            }

            nodeMap.put(temp, 1);
            temp = temp.next;

        }
        return false;
    }
    // TC - O(N*2*log(N))
    // SC - O(N)
    */




    static boolean detectLoop(Node head){

        Node slow = head;
        Node fast = head;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    // TC - O(N)
    // SC - O(1)

}
