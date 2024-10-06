package LinkedList;


class Node4 {
    int data;
    Node4 next;
    Node4 back;

    Node4(int data1, Node4 next1, Node4 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node4(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class InsertionDLL {

    private static void print(Node4 head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    private static Node4 insertBefHead(Node4 head, int val) {
        Node4 newHead = new Node4(val, head, (Node4)null);
        if (head != null) {
            head.back = newHead;
        }

        return newHead;
    }

    private static Node4 insertBefTail(Node4 head, int val) {
        if (head == null) {
            return new Node4(val);
        } else {
            Node4 tail;
            for(tail = head; tail.next != null; tail = tail.next) {
            }

            Node4 newNode = new Node4(val, (Node4)null, tail);
            tail.next = newNode;
            return head;
        }
    }

    private static Node4 insert_Bef_K_ele(Node4 head, int k, int val) {
        if (k == 1) {
            return insertBefHead(head, val);
        } else {
            Node4 temp = head;

            for(int cnt = 1; temp != null && cnt < k; temp = temp.next) {
                ++cnt;
            }

            if (temp == null) {
                System.out.println("Position " + k + " out of bounds");
                return head;
            } else {
                Node4 prev = temp.back;
                Node4 newNode = new Node4(val, temp, prev);
                prev.next = newNode;
                temp.back = newNode;
                return head;
            }
        }
    }

    private static Node4 insertBefNode(Node4 head, Node4 node, int val) {
        if (node == null) {
            System.out.println("Given node is null. Cannot insert before null.");
            return head;
        } else {
            Node4 prev = node.back;
            Node4 newNode = new Node4(val, node, prev);
            if (prev != null) {
                prev.next = newNode;
            } else {
                head = newNode;
            }

            node.back = newNode;
            return head;
        }
    }

    private static Node4 convertArr2DLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        } else {
            Node4 head = new Node4(arr[0]);
            Node4 prev = head;

            for(int i = 1; i < arr.length; ++i) {
                Node4 temp = new Node4(arr[i], (Node4)null, prev);
                prev.next = temp;
                prev = temp;
            }

            return head;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 8, 7, 9};
        Node4 head = convertArr2DLL(arr);
        System.out.println("Original List:");
        print(head);
        head = insertBefTail(head, 10);
        System.out.println("Insert at tail:");
        print(head);
        head = insertBefHead(head, 34);
        System.out.println("Insert at head:");
        print(head);
        head = insert_Bef_K_ele(head, 2, 22);
        System.out.println("Insert before 2nd element:");
        print(head);
        head = insertBefNode(head, head.next.next, 212);
        System.out.println("Insert before 3rd element:");
        print(head);
    }
}
