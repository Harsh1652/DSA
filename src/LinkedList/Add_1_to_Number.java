package LinkedList;

class Node10{
    int data;
    Node10 next;

    Node10(int data1, Node10 next1){
        this.data = data1;
        this.next = next1;
    }

    Node10(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class Add_1_to_Number {


    public static Node10 reverseList(Node10 head) {
        Node10 prev = null;
        Node10 curr = head;
        while (curr != null) {
            Node10 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;  // Return new head (reversed list)
    }
    public static Node10 addOne(Node10 head) {

        Node10 reversedHead = reverseList(head);

        Node10 current = reversedHead;
        int carry = 1;
        while (current != null) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }

            current = current.next;
        }

        if (carry != 0) {
            Node10 newNode = new Node10(carry);
            current.next = newNode;
        }

        return reverseList(reversedHead);
    }


    /*

    // Optimal Approach

    public static int helper(Node10 temp){
        if(temp == null){
            return 1;
        }

        int carry = helper(temp.next);
        temp.data += carry;

        if (temp.data < 10){
            return 0;
        }
        else {
            temp.data = 0;
            return 1;
        }
    }

    public static Node10 addOne (Node10 head){
        int carry = helper(head);
        if (carry == 1) {
            Node10 newHead = new Node10(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }
     */

    public static void printList(Node10 head) {
        Node10 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }




    public static void main(String[] args) {
        Node10 head = new Node10(9);
        head.next = new Node10(9);
        head.next.next = new Node10(9);
        head.next.next.next = new Node10(9);
        head.next.next.next.next = new Node10(9);

        System.out.println("Original List: ");
        printList(head);

        System.out.println("New List: ");
        Node10 result = addOne(head);
        printList(result);
    }
}
