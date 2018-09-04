package guerbai.f801_850;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeGroupPositions {

    private static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        char lastChar = S.charAt(0);
        for (int i=1; i<S.length(); i++) {
            if (S.charAt(i) != lastChar) {
                if (i - start>= 3) {
                    result.add(Arrays.asList(start, i-1));
                }
                lastChar = S.charAt(i);
                start = i;
            } else if (i == S.length() - 1) {
                if (i + 1 - start>= 3) {
                    result.add(Arrays.asList(start, i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "sss";
        largeGroupPositions(s);
    }
}
