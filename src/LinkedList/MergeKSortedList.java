package LinkedList;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Node23{
    int data;
    Node23 next;

    Node23(int val){
        this.data = val;
        this.next = null;
    }
}
public class MergeKSortedList {


    /*
    // Brute Force

    public static Node23 mergeSortedList(ArrayList<Node23> lists){
        ArrayList<Integer> mergedArrayList = new ArrayList<>();

        for(Node23 list: lists){
        Node23 current = list;
            while(current != null){
                mergedArrayList.add(current.data);
                current = current.next;
            }
        }
        Collections.sort(mergedArrayList);
        return createLL_FromArr(mergedArrayList);
    }

    public static Node23 createLL_FromArr(ArrayList<Integer>list){
        if (list.isEmpty()){
            return null;
        }

        Node23 head = new Node23(list.get(0));
        Node23 current = head;

        for (int i = 1; i < list.size(); i++){
            current.next = new Node23(list.get(i));
            current = current.next;
        }
        return head;
    }

    // TC - n * k + (m log m) + m
    // SC - O(m) + O(m)
*/



/*
    // Better
    public static Node23 mergeTwoLists(Node23 l1, Node23 l2){
        Node23 dummy = new Node23(-1);
        Node23 current = dummy;

        // Merge the two lists
        while (l1 != null && l2 != null){
            if (l1.data < l2.data){
                current.next = l1;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null){
            current.next = l1;
        }
        else {
            current.next = l2;
        }

        return dummy.next;
    }

    public static Node23 mergeKsortedLists(ArrayList<Node23>lists){
        if (lists.isEmpty()){
            return null;
        }

        Node23 mergedList = lists.get(0);
        for (int i = 1; i < lists.size(); i++){
            mergedList = mergeTwoLists(mergedList, lists.get(i));
        }

        return mergedList;
    }

    // Tc - n * ((k + k + 1)/2)
    // Sc - O(1)

 */

    // Optimized - (Min-Heap)

    static class NodeComparator implements java.util.Comparator<Node23> {
        public int compare(Node23 n1, Node23 n2) {
            return n1.data - n2.data;
        }
    }

    public static Node23 mergeKSortedLists(ArrayList<Node23> lists) {
        if (lists.isEmpty()) {
            return null;
        }
        PriorityQueue<Node23> minHeap = new PriorityQueue<>(new NodeComparator());

        for (Node23 list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        Node23 dummy = new Node23(-1);
        Node23 current = dummy;

        while (!minHeap.isEmpty()) {
            Node23 smallest = minHeap.poll();
            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next;

        // TC - k * log k + N * k * log k
        // SC - O(K)
    }
}




