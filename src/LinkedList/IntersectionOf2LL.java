package LinkedList;

import java.util.HashSet;

class Node11{
    int num;
    Node11 next;

    Node11(int val){
        this.num = val;
        next = null;
    }
}
public class IntersectionOf2LL {

    public static Node11 insertNode(Node11 head, int val){
        Node11 newNode = new Node11(val);

        if (head == null){
            head = newNode;
            return head;
        }

        Node11 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    /*
    // ----------------------------Brute Force--------------------------------------------------
    public static Node11 intersectionPoint(Node11 head1, Node11 head2){
        while (head2 != null){
            Node11 temp = head1;
            while (temp != null){
                if (temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;

        // TC - O(m*n)
        // SC - O(1)
    }
     */


    /*
    // -------------------------------------Best----------------------------------------
    public static Node11 intersectionPoint(Node11 head1, Node11 head2){
        HashSet<Node11> st = new HashSet<>();
        while (head1 != null){
            st.add(head1);
            head1 = head1.next;
        }

        while (head2 != null){
            if (st.contains(head2)){
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
    //------------------Better----------------------------------

    static int getDifference(Node11 head1, Node11 head2){
        int len1 = 0;
        int len2 = 0;

        while (head1 != null || head2 != null){
            if (head1 != null){
                len1++;
                head1 = head1.next;
            }
            if (head2 != null){
                len2++;
                head2 = head2.next;
            }
        }
        return len1 - len2;
    }

    static Node11 intersectionPoint(Node11 head1, Node11 head2){
        int diff = getDifference(head1, head2);
            if (diff < 0){
                while (diff++ != 0){
                    head2 = head2.next;
                }
            }
            else {
                while (diff-- != 0){
                    head1 = head1.next;
                }
            }
            while (head1 != null){
                if (head1 == head2){
                    return head1;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
        return head1;
    }

    // Tc - O(2max(length of list1, length of list2))+O(abs(length of list1 - length of list2))+O(min(length of list1, length of list2))
    // Sc - O(1)
     */



    static Node11 intersectionPoint(Node11 head1, Node11 head2){
        Node11 d1 = head1;
        Node11 d2 = head2;

        while (d1 != d2){
            d1 = d1 == null? head2:d1.next;
            d2 = d2 == null? head1:d2.next;
        }
        return d1;
    }

    // Tc - O(2 * max(length of list1, length of list2))
    // Sc - O(1)





        public static void printList(Node11 head) {
        while(head.next != null) {
            System.out.print(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    public static void main(String[] args) {
        Node11 head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);
        Node11 head1 = head;

        head = head.next.next.next;
        Node11 headSec = null;
        headSec=insertNode(headSec,3);
        Node11 head2 = headSec;
        headSec.next = head;

        //printing of the lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);

        //checking if intersection is present
        Node11 answerNode = intersectionPoint(head1,head2);
        if(answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+answerNode.num);

    }
}
