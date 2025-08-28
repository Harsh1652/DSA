package LinkedList;

import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
public class ReverseLL {

    /* 
    // ---------------------------------------BRUTE-------------------------------------------------
    public static Node reverseLL(Node head){

        Node temp  = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }

        return head;
    }
    
    */


    /* 
    //-------------------------------------BETTER--------------------------------------------------
    
    public static Node reverseLL(Node head){

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

    //TC - O(N)
    //SC - O(1)

    */

}
