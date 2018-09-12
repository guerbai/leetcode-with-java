package guerbai.f301_350;

import java.util.*;

public class TopKFrequent {

    // 可以用bucket sort，https://leetcode.com/problems/top-k-frequent-elements/discuss/81602/Java-O(n)-Solution-Bucket-Sort
    private static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        PriorityQueue<Integer> frequent = new PriorityQueue<>(k, Comparator.comparing(m::get));
        for (int num: nums) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        for (int key: m.keySet()) {
            if (frequent.size() < k) {
                frequent.offer(key);
            } else if (m.get(frequent.peek()) < m.get(key)) {
                frequent.poll();
                frequent.offer(key);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(frequent);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,5,3,5,3,1,1,3};
        System.out.println(topKFrequent(nums, 2));
    }
}
