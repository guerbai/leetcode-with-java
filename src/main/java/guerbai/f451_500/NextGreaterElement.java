package guerbai.f451_500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int n: nums2) {
            boolean peekLower = !s.empty() && s.peek() < n;
            while (peekLower) {
                int i = s.pop();
                m.put(i, n);
                peekLower = !s.empty() && s.peek() < n;
            }
            s.push(n);
        }
        for (int i=0; i<nums1.length; i++) {
            result[i] = m.getOrDefault(nums1[i], -1);
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums1 = {4, 1, 2};
//        int[] nums2 = {1, 3, 4, 2};
        int[] nums1 = {1,3,5,2,4,6,7};
        int[] nums2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
