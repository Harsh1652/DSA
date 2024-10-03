package LinkedList;


class Node3 {
    int data;
    Node3 next;
    Node3 back;

    Node3(int data1, Node3 next1, Node3 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node3(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DLL {
    private static void print(Node3 head) {
        while(head != null) {
            System.out.print("" + head.data);
            head = head.next;
            System.out.println();
        }

    }

    private static Node3 convertArr2DLL(int[] arr) {
        Node3 head = new Node3(arr[0]);
        Node3 prev = head;

        for(int i = 1; i < arr.length; ++i) {
            Node3 temp = new Node3(arr[i], (Node3)null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    private static Node3 deleteHead(Node3 head) {
        if (head != null && head.next != null) {
            Node3 prev = head;
            head = head.next;
            head.back = null;
            prev.next = null;
            return head;
        } else {
            return null;
        }
    }

    private static Node3 deleteTail(Node3 head) {
        if (head != null && head.next != null) {
            Node3 tail;
            for(tail = head; tail.next != null; tail = tail.next) {
            }

            Node3 newTail = tail.back;
            newTail.next = null;
            tail.back = null;
            return head;
        } else {
            return null;
        }
    }

    public static Node3 deleteKth(Node3 head, int k) {
        if (head == null) {
            return null;
        } else {
            int cnt = 0;

            Node3 kNode;
            for(kNode = head; kNode != null; kNode = kNode.next) {
                ++cnt;
                if (cnt == k) {
                    break;
                }
            }

            Node3 prev = kNode.back;
            Node3 front = kNode.next;
            if (prev == null && front == null) {
                return null;
            } else if (prev == null) {
                return deleteHead(head);
            } else if (front == null) {
                return deleteTail(head);
            } else {
                prev.next = front;
                front.back = prev;
                kNode.next = null;
                return head;
            }
        }
    }

    public static void deleteNode(Node3 temp) {
        Node3 prev = temp.back;
        Node3 front = temp.next;
        if (front == null) {
            prev.next = null;
        } else {
            prev.next = front;
            front.back = prev;
            temp.next = temp.back = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 8, 7};
        Node3 head = convertArr2DLL(arr);
        print(head);
        System.out.printf("After Deleting");
        System.out.println();
        deleteNode(head.next);
        print(head);
    }
}
