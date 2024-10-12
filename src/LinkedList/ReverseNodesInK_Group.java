package LinkedList;

class Node20{
    int val;
    Node20 next;

    Node20(int data, Node20 next1){
        this.val = data;
        this.next = next1;
    }

    Node20(int data){
        this.val = data;
    }
}
public class ReverseNodesInK_Group {
    static Node20 reverse(Node20 head){
        Node20 temp = head;
        Node20 prev = null;

        while (temp != null){
            Node20 front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static Node20 getKthNode(Node20 temp, int k){
        k -= 1;

        while (temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    static Node20 kReverse(Node20 head, int k){
        Node20 temp = head;
        Node20 prevLast = null;

        while (temp != null){
            Node20 KThNode = getKthNode(temp , k);
            if (KThNode == null){
                if (prevLast != null){
                    prevLast.next = temp;
                }
                break;
            }
            Node20 nextNode = KThNode.next;
            KThNode.next = null;

            reverse(temp);

            if (temp == head){
                head = KThNode;
            }
            else {
                prevLast.next = KThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
