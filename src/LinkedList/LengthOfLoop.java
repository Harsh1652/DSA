package LinkedList;
class Node14 {
    int num;
    Node14 next;

    Node14(int val, Node14 next1) {
        this.num = val;
        this.next = next1;
    }

    Node14(int val) {
        this.num = val;
    }

}
public class LengthOfLoop {
    public int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, a loop is detected
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }


    private int countLoopLength(Node loopNode) {
        Node temp = loopNode;
        int count = 1;

        while (temp.next != loopNode) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}


