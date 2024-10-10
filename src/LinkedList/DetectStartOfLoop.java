package LinkedList;

import java.util.HashMap;

class Node16{
    int num;
    Node16 next;

    Node16(int val, Node16 next1){
        this.num = val;
        this.next = next1;
    }

    Node16(int val){
        this.num = val;
        this.next = null;
    }
}
public class DetectStartOfLoop {

    /*
    //--------------------------Optimal Approach-------------------------------------
    public Node16 detectCycle(Node16 head) {
        int length = 0;

        Node16 fast = head;
        Node16 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        Node16 f = head;
        Node16 s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }

    public int lengthCycle(Node16 head) {
        Node16 fast = head;
        Node16 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node16 temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }


    // TC - O(N)
    // SC - O(1)

     */

    public Node16 detectCycle(Node16 head) {
        HashMap<Node16, Integer> mpp = new HashMap<>();
        Node16 temp = head;

        while (temp != null){
            if (mpp.containsKey(temp)){
                return temp;
            }
            mpp.put(temp,1);
            temp = temp.next;
        }
        return null;
    }

    // TC - O(N * 2 * (log(N)))
    // SC - O(N)
}


