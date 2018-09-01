package guerbai.f451_500;

public class MinMoves {

    // it's a math problem and description at [https://leetcode.com/problems/minimum-moves-to-equal-array-elements/discuss/93817/It-is-a-math-question]
    private static int minMoves(int[] nums){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int n: nums) {
            if (n < min) {
                min = n;
            }
            sum += n;
        }
        return sum - min * nums.length;
    }
}
