package LinkedList;

public class SearchingElement {
    class Node2 {
        int data;
        Node2 next;

        Node2(int data1, Node2 next1) {
            this.data = data1;
            this.next = next1;
        }

        Node2(int data1) {
            this.data = data1;
            this.next = null;
        }
    }
    public static boolean checkifPresent(Node2 head, int desiredElement) {
        for(Node2 temp = head; temp != null; temp = temp.next) {
            if (temp.data == desiredElement) {
                return true;
            }
        }

        return false;
    }

    public void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        Node2 head = new Node2(arr[0]);
        head.next = new Node2(arr[1]);
        head.next.next = new Node2(arr[2]);
        int val = 3;
        System.out.println(checkifPresent(head, val));
    }
}
