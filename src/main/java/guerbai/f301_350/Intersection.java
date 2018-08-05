package guerbai.f301_350;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int i=0; i<nums1.length; i++) {
            s1.add(nums1[i]);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int i=0; i<nums2.length; i++) {
            s2.add(nums2[i]);
        }
        s1.retainAll(s2);
        int[] result = new int[s1.size()];
        int index = 0;
        for (int i: s1) {
            result[index] = i;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1};
        intersection(nums1, nums2);
    }
}
