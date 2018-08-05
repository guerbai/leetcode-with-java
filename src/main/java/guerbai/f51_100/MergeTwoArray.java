package guerbai.f51_100;

public class MergeTwoArray {

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        int insertIndex = nums1Pointer + nums2Pointer + 1;
        while (nums1Pointer > -1 && nums2Pointer > -1) {
            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[insertIndex] = nums1[nums1Pointer];
                nums1Pointer--;
            } else {
                nums1[insertIndex] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            insertIndex--;
        }
        while (nums2Pointer > -1) {
            nums1[insertIndex] = nums2[nums2Pointer];
            nums2Pointer--;
            insertIndex--;
        }
    }
}
