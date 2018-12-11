package guerbai.f51_100;

public class SortColors {
    
    public void easySortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) count0++;
            if (nums[i] == 1) count1++;
            if (nums[i] == 2) count2++;
        }
        int index = 0;
        while (count0 > 0) {
            nums[index] = 0;
            count0--;
            index++;
        }
        while (count1 > 0) {
            nums[index] = 1;
            count1--;
            index++;
        }
        while (count2 > 0) {
            nums[index] = 2;
            count2--;
            index++;
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    // hard to understand: https://leetcode.com/problems/sort-colors/discuss/26481/Python-O(n)-1-pass-in-place-solution-with-explanation
    public void hardSortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;
        while (white <= blue) {
            if (nums[white] == 0) {
                swap(nums, red, white);
                white++;
                red++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                swap(nums, white, blue);
                blue--;
            }
        }        
    }

}