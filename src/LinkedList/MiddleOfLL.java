package LinkedList;

class Node12{
    int num;
    Node12 next;

    Node12(int data){
        this.num = data;
    }
}
public class MiddleOfLL {

    static Node12 insertion(Node12 head, int data){
        Node12 node = new Node12(data);

        if (head == null){
            head = node;
            return head;
        }

        Node12 temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    static void PrintLL(Node12 head){
        while (head.next != null){
            System.out.println(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    static Node12 middleLL(Node12 head){
        int cnt = 0;
        Node12 temp = head;
        while (temp == null){
            cnt++;
            temp = temp.next;
        }

        int mid = cnt/2 + 1;

        temp = head;
        while (mid != 0){
            mid--;
            temp =  temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {

    }
}
