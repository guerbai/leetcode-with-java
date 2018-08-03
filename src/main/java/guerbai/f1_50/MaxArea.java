package guerbai.f1_50;

public class MaxArea {

    private static int maxArea(int[] height) {
        int maxAreaSeen = 0;
        // 较短的一边向内靠拢；
        for (int i=0, j=height.length-1; i<=j;) {
            int low = Math.min(height[i], height[j]);
            int area = low*(j-i);
            maxAreaSeen = Math.max(area, maxAreaSeen);
            if (low==height[i]) {
                i++;
            } else {
                j--;
            }
        }
        return maxAreaSeen;
    }

    public static void main(String[] args) {
        int[] height = {2, 1};
        System.out.println(maxArea(height));
    }
}
