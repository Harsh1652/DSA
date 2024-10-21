package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

class Node22{
    int data;
    Node22 next;
    Node22 child;

    Node22(){
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node22(int val){
        this.data = val;
        this.next = null;
        this.child = null;
    }

    Node22(int val, Node22 nextNode, Node22 childNode) {
        data = val;
        next = nextNode;
        child = childNode;
    }
}
public class FlatteningA_LL {

    /*
    // Brute Force Approach
    static Node22 convertArrToLL(ArrayList<Integer>arr){
        Node22 dummyNode = new Node22(-1);
        Node22 temp = dummyNode;

        for (int i = 0; i < arr.size(); i++){
            temp.child = new Node22(arr.get(i));
            temp = temp.child;
        }
        return dummyNode.child;
    }

    static Node22 flattenLL(Node22 head){
        ArrayList<Integer> arr = new ArrayList<>();

        while (head != null){
            Node22 t2 = head;
            while(t2 != null){
                arr.add(t2.data);
                t2 = t2.child;
            }
            head = head.next;
        }
        Collections.sort(arr);

        return convertArrToLL(arr);
    }

    // TC - O(N * M) + O(N * M log(N * M)) + O(N + M)
    // SC - O(N * M) + O(N * M)
     */


    static Node22 merge(Node22 list1, Node22 list2){
        Node22 dummyNode = new Node22(-1);
        Node22 res = dummyNode;

        while (list1 != null && list2 != null){
            if (list1.data < list2.data){
                res.child = list1;
                res = list1;
                list1 = list1.child;
            }
            else{
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }
        if (list1 != null){
            res.child = list1;
        }
        else{
            res.child = list2;
        }
        if (dummyNode.child != null){
            dummyNode.child.next = null;
        }
        return dummyNode.child;
    }

    static Node22 flattenLl(Node22 head){
        if (head == null || head.next == null){
            return head;
        }

        Node22 mergedHead = flattenLl(head.next);
        head = merge(head, mergedHead);
        return head;
    }
}
