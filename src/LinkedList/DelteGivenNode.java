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


public class DelteGivenNode {
    
    //function to get reference of the node to delete
    static Node getNode(Node head,int val) {
        if(head==null)
        return null;
        while(head.data != val) {
            head = head.next;
        }
        
        return head;
    }

    //delete function as per the question
    static void deleteNode(Node t) {
        if(t==null)
        return;
        t.data = t.next.data;
        t.next = t.next.next;
        return;
    }
}
