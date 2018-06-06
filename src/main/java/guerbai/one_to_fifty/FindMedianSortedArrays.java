package guerbai.one_to_fifty;

public class FindMedianSortedArrays {

    public static double findMedianSortedArraysEasyWay(int[] nums1, int[] nums2) {
        assert !(nums1.length == 0 && nums2.length == 0);
        boolean totalEven = (nums1.length + nums2.length) % 2 == 0;
        int[] mergedNums = new int[nums1.length+ nums2.length];
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int mergedPointer = 0;
        while (mergedPointer<mergedNums.length) {
            if (nums1Pointer==nums1.length) {
                mergedNums[mergedPointer] = nums2[nums2Pointer];
                mergedPointer++;
                nums2Pointer++;
                continue;
            }
            if (nums2Pointer==nums2.length) {
                mergedNums[mergedPointer] = nums1[nums1Pointer];
                mergedPointer++;
                nums1Pointer++;
                continue;
            }
            if (nums1[nums1Pointer]<=nums2[nums2Pointer]) {
                mergedNums[mergedPointer] = nums1[nums1Pointer];
                nums1Pointer++;
            } else {
                mergedNums[mergedPointer] = nums2[nums2Pointer];
                nums2Pointer++;
            }
            mergedPointer++;
        }
        if (totalEven) {
            return (double) (mergedNums[mergedNums.length/2] + mergedNums[mergedNums.length/2-1])/2;
        } else {
            return mergedNums[mergedNums.length/2];
        }
    }

    // 寻找第k小的数的问题，需要淘汰掉k-1个显然比较小的元素；
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        assert !(nums1.length == 0 && nums2.length == 0);
        boolean totalEven = (nums1.length + nums2.length) % 2 == 0;
        int washedOutItemCount = (nums1.length + nums2.length - 1) / 2;
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        while (washedOutItemCount!=0) {
            int mid = washedOutItemCount/2;
            if (nums1.length-nums1Pointer>mid && nums2.length-nums2Pointer<=mid) {
                nums1Pointer += mid;
            } else if (nums1.length-nums1Pointer<=mid && nums2.length-nums2Pointer>mid) {
                nums2Pointer += mid;
            } else {
                if (nums1[nums1Pointer+mid]>nums2[nums2Pointer+mid]) {
                    nums2Pointer += mid;
                } else {
                    nums1Pointer += mid;
                }
            }
            washedOutItemCount /= 2;
        }
        if (!totalEven) {
            return Math.min(nums1[nums1Pointer], nums2[nums2Pointer]);
        }
        if (nums1.length==nums1Pointer) {
            return (nums2[nums2Pointer] + nums2[nums2Pointer+1])/2;
        } else if (nums2.length==nums2Pointer) {
            return (nums1[nums1Pointer] + nums1[nums1Pointer+1])/2;
        } else {
            return (nums1[nums1Pointer] + nums2[nums2Pointer])/2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArraysEasyWay(nums1, nums2));
    }
}
