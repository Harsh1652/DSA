package LinkedList;

import java.util.HashMap;

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

public class FindLoopStartingPoint {

    /* 
    //-----------------------------------BRUTE--------------------------------------------------
    static Node detectLoop(Node head){

        Node temp = head;

        HashMap<Node, Integer> nodeMap = new HashMap<>();

        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return temp;
            }
            nodeMap.put(temp,1);

            temp = temp.next;
        }

        return null;

    }

    // TC - O(N)
    // SC - O(N)
    */


    //---------------------------------OPTIMAL--------------------------------------

    static Node firstNode(Node head) {
        
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            return slow;
        }
        return null;
    }

    // TC - O(N)
    // SC - O(1)
   


    
}
