package guerbai.f451_500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindContentChildren {

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gp = 0;
        int sp = 0;
        int result = 0;
        while (gp < g.length && sp < s.length) {
            if (s[sp] >= g[gp]) {
                gp++;
                result++;
            }
            sp++;
        }
        return result;
    }
}
