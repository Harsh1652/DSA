package LinkedList;

import java.util.*;

class LFUCache {
    private class Node {
        int key, value, frequency;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }

    private final int capacity;
    private int minFrequency;
    private final Map<Integer, Node> keyNodeMap;
    private final Map<Integer, LinkedHashSet<Node>> frequencyMap;
    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        this.keyNodeMap = new HashMap<>();
        this.frequencyMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyNodeMap.containsKey(key)) {
            return -1;
        }
        Node node = keyNodeMap.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        if (keyNodeMap.containsKey(key)) {
            Node node = keyNodeMap.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            if (keyNodeMap.size() == capacity) {
                evictLFU();
            }
            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            frequencyMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
            minFrequency = 1;
        }
    }

    private void updateFrequency(Node node) {
        int freq = node.frequency;
        frequencyMap.get(freq).remove(node);
        if (frequencyMap.get(freq).isEmpty() && freq == minFrequency) {
            minFrequency++;
        }
        node.frequency++;
        frequencyMap.computeIfAbsent(node.frequency, k -> new LinkedHashSet<>()).add(node);
    }

    private void evictLFU() {
        LinkedHashSet<Node> nodes = frequencyMap.get(minFrequency);
        Node nodeToEvict = nodes.iterator().next();
        nodes.remove(nodeToEvict);
        if (nodes.isEmpty()) {
            frequencyMap.remove(minFrequency);
        }
        keyNodeMap.remove(nodeToEvict.key);
    }
}

