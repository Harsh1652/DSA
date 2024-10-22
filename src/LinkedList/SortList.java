package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node24{
    int data;
    Node24 next;


    Node24(int data1, Node24 next1){
        data = data1;
        next = next1;
    }

    Node24(int data1){
        data = data1;
        next = null;
    }
}
public class SortList {

    /*
    // Brute
    static Node24 sortLL(Node24 head){
        List<Integer> arr = new ArrayList<>();
        Node24 temp = head;

        while (temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(arr);

        temp = head;
        for (int i = 0; i<arr.size(); i++){
            temp.data = arr.get(i);

            temp = temp.next;
        }
        return head;
    }
    // TC - O(N) + O(N log N) + O(N)
    // SC - O(N)
     */

    Node24 mergeTwoSortedLinkedList(Node24 list1, Node24 list2){
        Node24 dummyNode = new Node24(-1);
        Node24 temp = dummyNode;

        while (list1 != null && list2 != null){
            if (list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return dummyNode.next;
    }

    Node24 findMiddle(Node24 head){
        if (head == null || head.next == null){
            return head;
        }

        Node24 slow = head;
        Node24 fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node24 sortLL(Node24 head){
        if (head == null || head.next == null){
            return head;
        }

         Node24 middle = findMiddle(head);
        Node24 right = middle.next;
        middle.next = null;
        Node24 left = head;

        left = sortLL(left);
        right = sortLL(right);

        return mergeTwoSortedLinkedList(left, right);

    }
}
