package LinkedList;

class Node6 {
    int data;
    Node6 next;
    Node6 back;

    Node6(int data1, Node6 next1, Node6 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node6(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    Node6() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }
}
public class Add2NumbersLinkedList {


    public Node6 addTwoNumbers(Node6 num1, Node6 num2) {
        Node6 dummyHead = new Node6(-1);
        Node6 curr = dummyHead;
        Node6 temp1 = num1;
        Node6 temp2 = num2;

        int carry;
        for(carry = 0; temp1 != null || temp2 != null; curr = curr.next) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }

            Node6 newNode = new Node6(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
        }

        if (carry > 0) {
            Node6 newNode = new Node6(carry);
            curr.next = newNode;
        }

        return dummyHead.next;
    }

    public static void printList(Node6 head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public void main(String[] args) {
        Node6 num1 = new Node6(2);
        num1.next = new Node6(4);
        num1.next.next = new Node6(3);
        Node6 num2 = new Node6(5);
        num2.next = new Node6(6);
        num2.next.next = new Node6(4);
        Node6 result = addTwoNumbers(num1, num2);
        System.out.print("Sum: ");
        printList(result);
    }
}
