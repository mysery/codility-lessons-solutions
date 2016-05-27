package mysery.interview.coderPad;

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named LRUCacheLinkedHashMap.
 *
 * If you need more classes, simply define them inline.
 */
//Design a "LRU" Cache with get and set methods.
public class LRUCacheNodeList {

    private final int capacity;
    Map<String, Node> map;
    Node head;
    Node tail;

    public LRUCacheNodeList(int cacheSize) {
        this.capacity = cacheSize;
        map = new HashMap(capacity);
    }

    public String get(String key) {
        Node n = map.get(key);
        if (n == null) {
            return null;
        }
        moveHead(n);
        return n.getValue();
    }

    public void put(String key, String value) {
        Node n = new Node(key, value);
        if (size() >= capacity) {
            removeTail();
            setHead(n);
        } else {
            setHead(n);
        }
        map.put(key, n);

    }

    public int size() {
        return map.size();
    }

    private void moveHead(Node n) {
        remove(n);
        setHead(n);
    }

    private void setHead(Node n) {
        n.setNext(head);
        n.setPrev(null);

        if (head != null) {
            head.setPrev(n);
        }

        head = n;

        if (tail == null) {
            tail = head;
        }
    }

    private void remove(Node n) {
        if (n.getPrev() != null) {
            n.getPrev().setNext(n.getNext());
        } else {
            head = n.getNext();
        }

        if (n.getNext() != null) {
            n.getNext().setPrev(n.getPrev());
        } else {
            tail = n.getPrev();
        }
    }

    private void removeTail() {
        map.remove(tail.getKey());
        remove(tail);
    }

    private static class Node {

        String key;
        String value;
        Node prev;
        Node next;

        public Node(String key, String value) {
            this.value = value;
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
