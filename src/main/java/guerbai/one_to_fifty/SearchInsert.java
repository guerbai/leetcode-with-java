package guerbai.one_to_fifty;

public class SearchInsert {

    private static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int pointer = 0;
        while (pointer < nums.length && nums[pointer] < target) {
            pointer++;
        }
        return pointer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }
}
