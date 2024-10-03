package LinkedList;
class Node9 {
    int data;
    Node9 next;

    Node9(int data, Node9 next1) {
        this.data = data;
        this.next = next1;
    }

    Node9(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList_is_Pallindrome_or_Not {
    static Node9 head;

    public LinkedList_is_Pallindrome_or_Not() {
    }

    public static Node9 reverseLL(Node9 head) {
        if (head != null && head.next != null) {
            Node9 newHead = reverseLL(head.next);
            Node9 front = head.next;
            front.next = head;
            head.next = null;
            return newHead;
        } else {
            return head;
        }
    }

    public static boolean isPallindrome(Node9 head) {
        if (head != null && head.next != null) {
            Node9 slow = head;

            for(Node9 fast = head; fast.next != null && fast.next.next != null; fast = fast.next.next) {
                slow = slow.next;
            }

            Node9 newHead = reverseLL(slow.next);
            Node9 first = head;

            for(Node9 second = newHead; second != null; second = second.next) {
                if (first.data != second.data) {
                    reverseLL(newHead);
                    return false;
                }

                first = first.next;
            }

            reverseLL(newHead);
            return true;
        } else {
            return true;
        }
    }

    public static void printLL(Node9 head) {
        for(Node9 temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data + " ");
        }

        System.out.println();
    }

    public void add(int data) {
        if (head == null) {
            head = new Node9(data);
        } else {
            Node9 temp;
            for(temp = head; temp.next != null; temp = temp.next) {
            }

            temp.next = new Node9(data);
        }

    }

    public static void main(String[] args) {
        LinkedList_is_Pallindrome_or_Not l1 = new LinkedList_is_Pallindrome_or_Not();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        printLL(head);
        System.out.println("Is the linkedlist a pallindrome?" + isPallindrome(head));
    }
}
