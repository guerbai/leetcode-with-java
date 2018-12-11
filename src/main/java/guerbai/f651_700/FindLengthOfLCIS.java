package guerbai.f651_700;

public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int maxL = 1;
        int countL = 1;
        int lastItem = nums[0];
        for (int i=1; i<nums.length; i++) {
            System.out.println(maxL);
            if (nums[i] > lastItem) {
                countL++;
            } else {
                maxL = Math.max(maxL, countL);
                countL = 1;
            }
            lastItem = nums[i];
        }
        return Math.max(maxL, countL);  
    }
}