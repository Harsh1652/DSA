package LinkedList;

import java.util.HashMap;

class Node25{

    int data;
    Node25 next;
    Node25 random;

    Node25(){
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Node25(int val){
        this.data = val;
        this.next = null;
        this.random = null;
    }

    Node25(int val, Node25 nextNode, Node25 randomNode){
        this.data = val;
        this.next = nextNode;
        this.random = randomNode;
    }
}
public class CloneLinkedList {

    /*
    // BruteForce

    public static Node25 cloneLL(Node25 head){
        Node25 temp = head;
        HashMap<Node25, Node25> map = new HashMap<>();

        while (temp != null){
            Node25 newNode = new Node25(temp.data);
            map.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            Node25 copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }

    public static void printClonedLL(Node25 head){
        while (head != null){
            System.out.println("Data: " + head.data);
            if (head.random != null){
                System.out.println(", Random: " + head.random.data);
            }else {
                System.out.println(", Random: nullptr");
            }
            System.out.println();
            head = head.next;
        }
        // TC - O(2N)
        // SC - O(N) + O(N)
    }
     */


    // Optimal Approach
    void insertCopyInBetween(Node25 head){
        Node25 temp = head;
        while (temp != null){
            Node25 nextElement = temp.next;
            Node25 copy =new Node25(temp.data);
            copy.next = nextElement;
            temp.next = copy;
            temp = nextElement;
        }
    }

    void connectRandomPointers(Node25 head){
        Node25 temp = head;
        while (temp != null){
            Node25 copyNode = temp.next;

            if (temp.random != null){
                copyNode.random = temp.random.next;
            }
            else {
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }

    Node25 getDeepCopyList(Node25 head){
        Node25 temp = head;
        Node25 dummyNode = new Node25(-1);
        Node25 res = dummyNode;

        while (temp != null){
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }

    Node25 cloneLL(Node25 head){
        if (head == null){
            return null;
        }
        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopyList(head);
    }

    public static void printClonedLL(Node25 head) {
        while (head != null) {
            System.out.println("Data: " + head.data);
            if (head.random != null) {
                System.out.println(", Random: " + head.random.data);
            } else {
                System.out.println(", Random: nullptr");
            }
            System.out.println();
            head = head.next;
        }
    }
}
