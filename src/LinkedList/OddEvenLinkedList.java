//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int i) {
        this.val = x;
        this.next = null;
    }
}
public class OddEvenLinkedList {
    static ListNode head = null;
    static ListNode tail = null;



    static void printLL(ListNode head) {
        for(ListNode curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val + " --> ");
        }

        System.out.println("null");
    }

    static void InsertAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    static ListNode SegregatetoOddEven() {
        ListNode oddHead = new ListNode(-1);
        ListNode oddTail = oddHead;
        ListNode evenHead = new ListNode(-1);
        ListNode evenTail = evenHead;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr;
            curr = curr.next;
            temp.next = null;
            if (temp.val % 2 != 0) {
                oddTail.next = temp;
                oddTail = temp;
            } else {
                evenTail.next = temp;
                evenTail = temp;
            }
        }

        evenTail.next = oddHead.next;
        return evenHead.next;
    }

    public static void main(String[] args) {
        InsertAtLast(1);
        InsertAtLast(2);
        InsertAtLast(3);
        InsertAtLast(4);
        InsertAtLast(5);
        System.out.println("Initial LinkedList: ");
        printLL(head);
        ListNode newHead = SegregatetoOddEven();
        System.out.println("LinkedList after segregation: ");
        printLL(newHead);
    }
}
