package guerbai.f1_50;

public class IsMatch {

    private static boolean isMatch(String s, String p) {
        if (p.length()==0) {
            return (s.length()==0);
        }
        boolean match = s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length()>=2 && p.charAt(1)=='*') {
            // 最关键的点在后面，比如aaab与a*b，就是靠着一手(match && isMatch(s.substring(1), p))
            // 来消耗aaab至b，此时a*b还是a*b，在下一次到这里时，s还是b，p直接变为b，
            // *就是通过这种方式来实现匹配零个或多个。
            return isMatch(s, p.substring(2)) || (match && isMatch(s.substring(1), p));
        } else {
            return match && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
//        String s = "ab";
//        String p = ".*c";
//        System.out.println(isMatch(s, p));
        String s1 = "a";
        String p1 = ".*..a*";
        System.out.println(isMatch(s1, p1));
    }
}
