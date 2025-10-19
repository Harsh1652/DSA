package Stack_Queue;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key, value, cnt;
    Node next;
    Node prev;

    Node(int _key, int _value) {
        key = _key;
        value = _value;
        cnt = 1;
    }
}

class List {
    int size; // Size
    Node head; // Dummy head
    Node tail; // Dummy tail

    // Constructor
    List() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    // Function to add node in front
    void addFront(Node node) {
        Node temp = head.next;
        node.next = temp;
        node.prev = head;
        head.next = node;
        temp.prev = node;
        size++;
    }

    // Function to remove node from the list
    void removeNode(Node delnode) {
        Node prevNode = delnode.prev;
        Node nextNode = delnode.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
    }
}

public class LFUcache {
    private Map<Integer, Node> keyNode;
    private Map<Integer, List> freqListMap;
    private int maxSizeCache;
    private int minFreq;
    private int curSize;

    public LFUcache(int capacity) {
        maxSizeCache = capacity;
        minFreq = 0;
        curSize = 0;
        keyNode = new HashMap<>();
        freqListMap = new HashMap<>();
    }

    public void updateFreqListMap(Node node) {
        keyNode.remove(node.key);
        freqListMap.get(node.cnt).removeNode(node);
        if (node.cnt == minFreq && freqListMap.get(node.cnt).size == 0) {
            minFreq++;
        }

        List nextHigherFreqList = new List();
        if (freqListMap.containsKey(node.cnt + 1)) {
            nextHigherFreqList = freqListMap.get(node.cnt + 1);
        }

        node.cnt += 1;
        nextHigherFreqList.addFront(node);
        freqListMap.put(node.cnt, nextHigherFreqList);
        keyNode.put(node.key, node);
    }

    public int get(int key) {
        if (keyNode.containsKey(key)) {
            Node node = keyNode.get(key);
            updateFreqListMap(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (maxSizeCache == 0) {
            return;
        }

        if (keyNode.containsKey(key)) {
            Node node = keyNode.get(key);
            node.value = value;
            updateFreqListMap(node);
        } else {
            if (curSize == maxSizeCache) {
                List list = freqListMap.get(minFreq);
                keyNode.remove(list.tail.prev.key);
                freqListMap.get(minFreq).removeNode(list.tail.prev);
                curSize--;
            }
            curSize++;
            minFreq = 1;
            List listfreq = new List();

            if (freqListMap.containsKey(minFreq)) {
                listfreq = freqListMap.get(minFreq);
            }

            Node node = new Node(key, value);

            listfreq.addFront(node);
            keyNode.put(key, node);
            freqListMap.put(1, listfreq);
        }
    }

}
