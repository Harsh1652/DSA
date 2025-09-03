package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node next;
    Node child;

    Node(int data, Node next, Node child){
        this.data = data;
        this.next = next;
        this.child = child;
    }

    Node(int data){
        this.data = data;
    }


}

public class flatteningLL {
    
    /* 
    //------------------------------BRUTE----------------------------------------------------------
    static Node convertArrToLinkedList(ArrayList<Integer> arr){

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        for (int i = 0; i < arr.size(); i++) {
            temp.child = new Node(arr.get(i));

            temp = temp.child;
        }


        return dummyNode.child;
    }

    static Node flattenLinkedList(Node head){

        ArrayList<Integer> arr = new ArrayList<>();

        while (head != null) {
            Node t2 = head;
            while (t2 != null) {
                arr.add(t2.data);
                t2 = t2.child;
            }
            head = head.next;
        }

        Collections.sort(arr);

        return convertArrToLinkedList(arr);
    }

    // TC - O(N*M) + O(N*M log(N*M)) + O(N*M)
    // SC - O(N*M) + O(N*M)

    */


    //--------------------------------OPTIMAL--------------------------------------

    static Node merge(Node list1, Node list2){

        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }

        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }

         if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }
        return dummyNode.child;
    }


    static Node flattenLinkedList(Node head) {
       
        if (head == null || head.next == null) {
            return head;
        }

        Node mergedHead = flattenLinkedList(head.next);
        head = merge(head, mergedHead);
        return head;
    }

    // TC - O( N*(2M) ) ~ O(2 N*M)
    // SC - O(1)

}
