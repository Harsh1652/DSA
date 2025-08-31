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
    }
}

public class checkPallindrome {


    /*
    -----------------------------------------------BRUTE-------------------------------------------------------
    static boolean isPallindrome(Node head){

        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while(temp != null){
            st.push(temp.data);
        }

        temp = head;

        while (temp != null) {
            if (temp.data != st.peek()) {
                return false;   
            }
            st.pop();
            temp = temp.next;
        }
        return true;
    }

    // TC - O(2*N)
    // SC - O(N)
    */
    



    //--------------------------------OPTIMAL-------------------------------------------------
    static Node reverseLinkedList(Node head){


        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLinkedList(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;
        
        return newHead;
    }

    static boolean isPallindrome(Node head){
        if (head == null || head.next != null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverseLinkedList(slow.next);
        Node first = head;
        Node second = newHead;

        while (second != null) {
              if (first.data != second.data) {
                
                reverseLinkedList(newHead);

                return false;
            }
            first = first.next;
            second = second.next;
        }
    
        reverseLinkedList(newHead);
        return true;
    }   

    // TC - O(2*N)
    // SC - O(1)
}
