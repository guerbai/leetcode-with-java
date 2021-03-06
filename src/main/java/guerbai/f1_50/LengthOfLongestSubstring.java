package guerbai.f1_50;

public class LengthOfLongestSubstring {

    private static int lengthOfLongestSubstring(String s) {
        int sLen = s.length();
        if (sLen<2) return sLen;
        int frontIndex = 0;
        int maxSubStringLen = 1;
        for (int endIndex=1; endIndex<sLen; endIndex++) {
            for (int j=frontIndex; j<endIndex; j++) {
                if (s.charAt(j)==s.charAt(endIndex)) {
                    if (endIndex-frontIndex>maxSubStringLen) {
                        maxSubStringLen = endIndex-frontIndex;
                    }
                    frontIndex = j + 1;
                    break;
                }
            }
        }
        if (sLen-frontIndex>maxSubStringLen) {
            maxSubStringLen = sLen-frontIndex;
        }
        return maxSubStringLen;
    }

    public static void main(String[] args) {
        String s = "abcdefga";
        System.out.println(lengthOfLongestSubstring(s));
        String s2 = "aabcdefg";
        System.out.println(lengthOfLongestSubstring(s2));
        String s3 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s3));
        String s4 = "dvdf";
        System.out.println(lengthOfLongestSubstring(s4));

    }
}
