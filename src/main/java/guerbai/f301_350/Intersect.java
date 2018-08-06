package guerbai.f301_350;

import java.util.*;

public class Intersect {

    private static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> num1m = new HashMap<>();
        for (int i=0; i<nums1.length; i++) {
            if (num1m.containsKey(nums1[i])) {
                num1m.put(nums1[i], num1m.get(nums1[i])+1);
            } else {
                num1m.put(nums1[i], 1);
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i=0; i<nums2.length; i++) {
            if (num1m.containsKey(nums2[i])) {
                resultList.add(nums2[i]);
                if (num1m.get(nums2[i]) > 1) {
                    num1m.put(nums2[i], num1m.get(nums2[i])-1);
                } else if (num1m.get(nums2[i]) == 1){
                    num1m.remove(nums2[i]);
                }
            }
        }
        int[] result = new int[resultList.size()];
        for (int i=0; i<resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 7, 9, 7, 6, 7};
        int[] nums2 = {5, 0, 0, 6, 1, 6, 2, 2, 4};
        intersect(nums1, nums2);
    }
}
