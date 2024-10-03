package LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data1, Node1 next1) {
        this.data = data1;
        this.next = next1;
    }

    Node1(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LengthOfLinkedList {
    public LengthOfLinkedList() {
    }

    private static int lenghtofLL(Node1 head) {
        int cnt = 0;

        for(Node1 temp = head; temp != null; ++cnt) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.printf("Length of LL is: ");
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 8, 7};
        Node1 head = new Node1(arr[0]);
        head.next = new Node1(arr[1]);
        head.next.next = new Node1(arr[2]);
        head.next.next.next = new Node1(arr[3]);
        System.out.println(lenghtofLL(head));
    }
}
