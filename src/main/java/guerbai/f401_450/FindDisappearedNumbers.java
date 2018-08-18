package guerbai.f401_450;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for (int i=1; i<nums.length+1; i++) {
            s1.add(i);
        }
        for (int n: nums) {
            if (s1.contains(n)) {
                s1.remove(n);
            }
        }
        System.out.println(s1);
        List<Integer> result = new ArrayList<>();
        result.addAll(s1);
        return result;
    }

    // very clever way.
    private static List<Integer> cleverWay(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        cleverWay(nums);
    }
}
