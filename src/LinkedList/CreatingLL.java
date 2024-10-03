package LinkedList;

//import org.w3c.dom.Node;
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class CreatingLL {

    public void main(String[] args) {
        int[] arr = new int[]{2, 5, 8, 7};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
        Node x = new Node(arr[1]);
        Node z = x;
        System.out.println(z);
    }
}