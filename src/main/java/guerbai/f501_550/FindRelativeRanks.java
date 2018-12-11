package guerbai.f501_550;

import java.util.Arrays;

public class FindRelativeRanks {

    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        int[][] pair = new int[nums.length][2];
        for (int i=0; i<nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));
        for (int i=0; i<nums.length; i++) {
            if (i == 0) {
                result[pair[i][1]] = "Gold Medal";
            } else if (i == 1) {
                result[pair[i][1]] = "Silver Medal";
            } else if (i == 2) {
                result[pair[i][1]] = "Bronze Medal";
            } else {
                result[pair[i][1]] = String.valueOf(i+1);
            }
        }
        return result;
    }

}