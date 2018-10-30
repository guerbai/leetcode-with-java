package guerbai.f751_800;

import java.util.*;

public class RotateString {

    private static boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.length() == 0) return true;
        List<Integer> indexList = new ArrayList<>();
        for (int i=0; i<B.length(); i++) {
            if (B.charAt(i) == A.charAt(0)) {
                indexList.add(i);
            }
        }
        for (int i: indexList) {
            if (B.substring(i, B.length()).equals(A.substring(0, B.length() - i))
                    && B.substring(0, i).equals(A.substring(B.length() - i, B.length()))) {
                return true;
            }
        }
        return false;
    }

}