package guerbai.f701_750;

import java.util.PriorityQueue;

public class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    // 维护前k大的元素入minHeap，维护minHeap.peek()为第k大元素;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i: nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
