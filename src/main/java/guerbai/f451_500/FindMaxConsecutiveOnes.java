package guerbai.f451_500;

public class FindMaxConsecutiveOnes {

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int thisCount = 0;
        boolean inOne = false;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1 && !inOne) {
                thisCount++;
                inOne = true;
            } else if (nums[i] == 0 && inOne) {
                maxCount = Math.max(thisCount, maxCount);
                thisCount = 0;
                inOne = false;
            } else if (nums[i] == 1 && inOne) {
                thisCount++;
            }
        }
        maxCount = Math.max(thisCount, maxCount);
        return maxCount;
    }
}
