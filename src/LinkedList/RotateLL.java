package LinkedList;

class Node21{
    int num;
    Node21 next;

    Node21(int data){
        this.num = data;
        next = null;
    }
}
public class RotateLL {

    static Node21 inserNode(Node21 head, int val){
        Node21 newNode = new Node21(val);
        if (head == null){
            head = newNode;
            return head;
        }
        Node21 temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    /*
    // BruteForce
    static  Node21 rotateRight(Node21 head, int k){
        if (head == null || head.next == null){
            return head;
        }

        for (int i = 0; i< k; i++){
            Node21 temp = head;

            while (temp.next.next != null){
                temp = temp.next;
            }

            Node21 end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;

        // TC - O(Number of nodes in k)
        // SC - O(1)
    }
     */

    //Optimal Approach
    static  Node21 rotateRight(Node21 head, int k){
        if (head == null || head.next == null){
            return head;
        }
        Node21 temp = head;
        int length = 1;
        while (temp.next != null){
            length++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % length;
        int end = length - k;
        while (end-- != 0){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
    // TC - O(length of list) + O(length of list - (length of list % k))
    // SC - O(1)

    static void printList(Node head) {
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }


}
