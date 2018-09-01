package guerbai.f451_500;

public class RepeatedSubstringPattern {

    private static boolean repeat(String str, int len) {
        int startIndex = 0;
        String repeatStr = str.substring(0, startIndex+len);
        startIndex += len;
        while (startIndex < str.length()) {
            if (!str.substring(startIndex, startIndex+len).equals(repeatStr)) {
                return false;
            }
            startIndex += len;
        }
        return true;
    }

    // stupic way.
    private static boolean repeatedSubstringPattern(String s) {
        int repeatCount = 2;
        while (s.length() / repeatCount > 0) {
            if (s.length() % repeatCount == 0) {
                int len = s.length() / repeatCount;
                if (repeat(s, len)) {
                    return true;
                }
            }
            repeatCount++;
        }
        return false;
    }

    // explain here: https://leetcode.com/problems/repeated-substring-pattern/discuss/94334/Easy-python-solution-with-explaination
    // hard to understand.
    private static boolean cleverWay(String s) {
        return (s+s).substring(1, (2*s.length()-1)).contains(s);
    }
}

