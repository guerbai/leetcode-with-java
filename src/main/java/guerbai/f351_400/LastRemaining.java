package guerbai.f351_400;

public class LastRemaining {

    // explanation at: https://leetcode.com/problems/elimination-game/discuss/87119/JAVA:-Easiest-solution-O(logN)-with-explanation
    private static int lastRemaining(int n) {
        int head = 1;
        int remainStep = 1;
        boolean fromLeft = true;
        int l = n;
        while (l > 1) {
            if (fromLeft || l % 2 == 1) {
                head += remainStep;
            }
            fromLeft = !fromLeft;
            remainStep *= 2;
            l /= 2;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }
}
