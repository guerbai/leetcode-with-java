package guerbai.fiftyone_to_hundred;

import java.util.ArrayList;
import java.util.List;

public class ClimbStairs {

    private static int climbStairs(int n) {
        int[] cache = new int[n+1];
        if (n == 1) return 1;
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        for (int i=3; i<=n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }
}
