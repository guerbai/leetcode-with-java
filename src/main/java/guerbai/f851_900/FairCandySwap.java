package guerbai.f851_900;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    private static int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> s = new HashSet<>();
        int sa = 0;
        int sb = 0;
        for (int a: A) {
            sa += a;
        }
        for (int b: B) {
            sb += b;
        }
        for (int b: B) {
            s.add(b);
        }
        for (int a: A) {
            int t = a - (sa - sb) / 2;
            if (s.contains(t)) {
                return new int[]{a, t};
            }
        }
        return new int[]{0, 0};
    }

}