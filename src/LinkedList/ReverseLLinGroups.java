package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
    }
}

public class ReverseLLinGroups {

    static Node ReverseLL(Node head){
        
        Node temp = head;
        Node prev = null;

        while (temp != null) {

            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static Node getKthNode(Node temp, int k){
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }


    //function to reverse nodes in k group
    static Node kReverse(Node head, int k){

        Node temp = head;
        Node prevLast = null;

        while (temp != null) {
            Node kthNode = getKthNode(temp, k);
            if (kthNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;

            ReverseLL(temp);
            if (temp == head) {
                head = kthNode;     
            }
            else{
                prevLast.next = kthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
    
    // TC - O(2N)
    // SC - O(1)
}
