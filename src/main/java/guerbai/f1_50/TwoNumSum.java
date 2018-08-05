package guerbai.f1_50;

public class TwoNumSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i<nums.length-1; i++) {
            result[0] = i;
            for (int j=i+1; j<nums.length; j++) {
                if (nums[result[0]]+nums[j]==target) {
                    result[1] = j;
                    return result;
                }
            }
        }
        result[0] = result[1] = -1;
        return result;
    }

    public static void main(String[] args) {
        int[] s = {2, 7, 11, 15};
        TwoNumSum twoNumSum = new TwoNumSum();
        int[] result = twoNumSum.twoSum(s, 9);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
