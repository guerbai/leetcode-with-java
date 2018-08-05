package guerbai.f201_250;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i=0; i < nums.length; i++) {
            if (!s.contains(nums[i])) {
                s.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
