package LinkedList;

class Node17 {
    int data;
    Node17 next;
    Node17 back;

    Node17(int data1, Node17 next1, Node17 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node17(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class DeleteAllOccurenceOfKey {

    static Node17 deleteAllOcc(Node17 head, int key) {
        Node17 temp = head;

        while (temp != null) {
            if (temp.data == key) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.back = null;
                    }
                } else {

                    if (temp.back != null) {
                        temp.back.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.back = temp.back;
                    }
                }
            }
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node17 head) {
        Node17 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node17 head = new Node17(10);
        head.next = new Node17(20);
        head.next.back = head;
        head.next.next = new Node17(30);
        head.next.next.back = head.next;
        head.next.next.next = new Node17(20);
        head.next.next.next.back = head.next.next;

        System.out.println("Original list:");
        printList(head);

        head = deleteAllOcc(head, 20);

        System.out.println("After deleting all occurrences of 20:");
        printList(head);
    }
}
