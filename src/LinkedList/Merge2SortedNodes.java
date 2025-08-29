package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

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

public class Merge2SortedNodes {

    /*
   //------------------------------BRUTE---------------------------------------------

   static Node convertArrToLinkedList(ArrayList<Integer>arr){

    Node dummyNode = new Node(-1);
    Node temp =  dummyNode;

    for (int i = 0; i < arr.size(); i++) {
        temp.next = new Node(arr.get(i));
        temp = temp.next;
    }
    
    return dummyNode.next;
   }

   static Node sortTwoLinkedList(Node list1, Node list2){

    ArrayList<Integer> arr = new ArrayList<>();

    Node temp1 = list1;
    Node temp2 = list2;

    while (temp1 != null) {
        arr.add(temp1.data);
        temp1 = temp1.next;
    }

     while (temp2 != null) {
        arr.add(temp2.data);
        temp2 = temp2.next;
    }

    Collections.sort(arr);

    Node head = convertArrToLinkedList(arr);

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

    // TC - O(N1 + N2) + O(N log N) + O(N)
    // SC - O(N) + O(N)
    */



    //------------------------------OPTMAL-----------------------------------------------------

    static Node sortTwoLinkedLists(Node list1, Node list2) {

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (list1 !=  null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        
        return dummyNode.next;
    }

    // TC - O(N1 + N2)
    // SC - O(1)

}
    
