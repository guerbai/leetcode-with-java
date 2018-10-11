package guerbai.f101_150;

import guerbai.util.DLinkedNode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    int count, capacity;
    DLinkedNode head, tail;
    Map<Integer, DLinkedNode> cache = new HashMap<>();

    private void addNode(DLinkedNode node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    private void moveToHead(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
        node.next = head.next;
        node.pre = head;
        head.next = node;
        node.next.pre = node;
    }

    private void removeTail() {
        DLinkedNode node = tail.pre;
        tail.pre = node.pre;
        node.pre.next = tail;
        node.pre = null;
        node.next = null;
        cache.remove(node.key);
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.pre = null;
        tail.next = null;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (cache.get(key) == null) {
            return -1;
        }
        DLinkedNode node = cache.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node;
        if (cache.get(key) == null) {
            if (count == capacity) {
                removeTail();
            } else {
                count++;
            }
            node = new DLinkedNode();
            node.key = key;
            node.value = value;
            cache.put(key, node);
            addNode(node);
        } else {
            node = cache.get(key);
            node.value = value;
            moveToHead(node);
        }
    }

    public static void main(String[] args) {
        LRUCache c = new LRUCache(2);
        c.put(2, 1);
        c.put(2, 2);
        c.get(2);
    }

}
