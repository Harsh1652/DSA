package LinkedList;

import java.util.HashSet;

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

public class findIntersectionPoint {


    /*
    //--------------------------------BRUTE--------------------------------------------------
    static Node IntersectionPoint(Node head1, Node head2){

        while (head2 != null) {
            Node temp = head1;

            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
        // TC - O(m*n)
        // SC - O(1)
    */



    /* 
    //---------------------------------Better-----------------------------------------------
    static Node IntersectionPoint(Node head1, Node head2){

        HashSet<Node> st = new HashSet<>();

        while (head1 != null) {
            st.add(head1);
            head1 = head1.next;
        }

        while (head2 != null) {
            if (st.contains(head2)) {
                return head2;
            }
            head2 = head2.next;
        }

        return null;
    }
    // TC - O(m+n)
    // SC - O(n)
    */



    /* 
    static int getDifference(Node head1, Node head2){

        int len1 =0;
        int len2 = 0;

        while (head1 != null || head2 != null) {
            if(head1 != null){
                ++len1;
                head1 = head1.next;
            }
            if (head2 != null) {
                ++len2;
                head2 = head2.next;
            }
        }
        return len1 - len2;
    }

    static Node IntersectionPoint(Node head1, Node head2){

        int diff = getDifference(head1,head2);
        if (diff < 0) {
            while (diff++ != 0){
                head2 = head2.next;  
            }
        }
        else{
            while (diff-- != 0) {
                head1 = head1.next;
            }
        }

        while(head1 != null) {
            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;

    }

    // TC - O(2max(length of list1,length of list2))+O(abs(length of list1-length of list2))+O(min(length of list1,length of list2))
    // SC - O(1)
    */


    /* 
    //--------------------------------OPTIMAL-------------------------------------------------------------------
    static Node intersectionPresent(Node head1,Node head2) {
        Node d1 = head1;
        Node d2 = head2;
        
        while(d1 != d2) {
            d1 = d1 == null? head2:d1.next;
            d2 = d2 == null? head1:d2.next;
        }
        
        return d1;
    }

    // TC - Time Complexity: O(2*max(length of list1,length of list2))
    // SC - O(1)
    */
    
}
