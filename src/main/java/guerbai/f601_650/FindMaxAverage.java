package guerbai.f601_650;

public class FindMaxAverage {

    private static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += nums[i];
        }
        int m = sum;
        for (int i=k; i<nums.length; i++) {
            int nextSum = sum + nums[i] - nums[i-k];
            if (nextSum > m) {
                m = nextSum;
            }
            sum = nextSum;
        }
        return (double) m / k;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(findMaxAverage(nums, 1));
    }
}
