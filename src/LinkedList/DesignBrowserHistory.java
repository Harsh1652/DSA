package LinkedList;

class Node26 {
    String url;
    Node26 next;
    Node26 prev;

    Node26(String url) {
        this.url = url;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    private Node26 head;
    private Node26 current;
    private Node26 tail;

    public BrowserHistory() {
        head = null;
        current = null;
        tail = null;
    }


    public void visit(String url) {
        Node26 newNode = new Node26(url);

        if (current != null) {
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.url;
        }
        return null;
    }

    public String forward() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.url;
        }
        return null;
    }

    public void printHistory() {
        Node26 temp = head;
        while (temp != null) {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }
}

public class DesignBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visit("google.com");
        browserHistory.visit("instagram.com");
        browserHistory.visit("github.com");

        System.out.println("Current URL: " + browserHistory.back());
        System.out.println("Current URL: " + browserHistory.back());
        System.out.println("Current URL: " + browserHistory.forward());

        System.out.println("History:");
        browserHistory.printHistory();
    }
}
