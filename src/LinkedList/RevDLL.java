package LinkedList;

class Node5 {
    int data;
    Node5 next;
    Node5 back;


    Node5(int data1, Node5 next1, Node5 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }


    Node5(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }


    Node5() {
        this.data = 0;
        this.next = null;
        this.back = null;
    }
}

public class RevDLL {

    public static Node5 reverseDll(Node5 head) {
        if (head == null) {
            return null;
        }

        Node5 current = head;
        Node5 prev = null;
        Node5 temp = null;


        while (current != null) {

            temp = current.next;

            current.next = prev;
            current.back = temp;

            prev = current;
            current = temp;
        }

        return prev;
    }

    public static void printList(Node5 head) {
        Node5 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node5 node1 = new Node5(1);
        Node5 node2 = new Node5(2);
        Node5 node3 = new Node5(3);
        Node5 node4 = new Node5(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node2.back = node1;
        node3.back = node2;
        node4.back = node3;


        System.out.println("Original list:");
        printList(node1);

        Node5 reversedHead = reverseDll(node1);

        System.out.println("Reversed list:");
        printList(reversedHead);


        System.out.println("Reversed list (from tail to head):");
    }
}
