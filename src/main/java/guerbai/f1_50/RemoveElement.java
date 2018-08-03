package guerbai.f1_50;

public class RemoveElement {

    private static int removeElement(int[] nums, int val) {
        int replaceIndex = 0;
        int result = nums.length;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==val) {
                result--;
            } else {
                nums[replaceIndex] = nums[i];
                replaceIndex++;
            }
        }
        return result;
    }
}
