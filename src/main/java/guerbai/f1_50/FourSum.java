package guerbai.f1_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    private static List<ArrayList<Integer>> threeSum(int[] nums, int target) {
        for (int i: nums) {
            System.out.println(i);
        }
        System.out.println();
        List<ArrayList<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length-2; i++) {
            // 这里的处理超烦人.
            if (i!=0 && nums[i]==nums[i-1]) continue;
            int next = i+1;
            int last = nums.length-1;
            while (last-next>=1) {
                int sum = nums[i]+nums[next]+nums[last];
                if (sum>target) {
                    int v = nums[last];
                    while (last>i && nums[last-1]==v) {
                        last--;
                    }
                    last--;
                } else if (sum<target) {
                    int v = nums[next];
                    while (next<last && nums[next+1]==v) {
                        next++;
                    }
                    next++;
                } else {
                    ArrayList<Integer> s = new ArrayList<>();
                    s.add(nums[i]);
                    s.add(nums[next]);
                    s.add(nums[last]);
                    result.add(s);
                    int v = nums[last];
                    while (last>i && nums[last-1]==v) {
                        last--;
                    }
                    last--;
                    v = nums[next];
                    while (next<last && nums[next+1]==v) {
                        next++;
                    }
                    next++;
                }
            }
        }
        return result;
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-3;i++) {
            if (i!=0 && nums[i]==nums[i-1]) continue;
            int innerTarget = target - nums[i];
            for (List<Integer> threeResult: threeSum(Arrays.copyOfRange(nums, i+1, nums.length), innerTarget)) {
                threeResult.add(nums[i]);
                result.add(threeResult);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] s = {-1,-5,-5,-3,2,5,0,4};
        System.out.println(fourSum(s, -7));
    }
}
