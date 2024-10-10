package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Node18 {
    int data;
    Node18 next;
    Node18 back;

    Node18(int data1, Node18 next1, Node18 back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node18(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}


public class FindSumWithGivenPairsSortedDLL {

    /*
    //-----------------------Optimal Approach------------------------------------------
    static Node18 findTail(Node18 head){
        Node18 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    static ArrayList<List<Integer>> FindSum(Node18 head, int sum){
        Node18 left = head;
        Node18 right = findTail(head);

        ArrayList<List<Integer>> ds = new ArrayList<>();

        while (left != null && right != null && left != right && left.data < right.data){

            if (left.data + right.data == sum){
                List<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ds.add(pair);

                left = left.next;
                right = right.back;
            } else if (left.data + right.data < sum) {
                left = left.next;
            }
            else {
                right = right.back;
            }
        }
        return ds;
    }

    // TC - O(2N)
    // SC - O(1)
 */


    static ArrayList<List<Integer>> FindSum(Node18 head, int sum) {

        ArrayList<List<Integer>> ds = new ArrayList<>();
        Node18 temp1 = head;
        Node18 temp2;
        while (temp1 != head) {
            temp2 = temp1.next;


            while (temp2 != null && temp1.data + temp2.data <= sum) {
                ArrayList<Integer> pair = new ArrayList<>();
                if (temp1.data + temp2.data == sum) {
                    pair.add(temp1.data);
                    pair.add(temp2.data);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return ds;
    }
    // TC - O(N^2)
    // SC - O(1)
}
