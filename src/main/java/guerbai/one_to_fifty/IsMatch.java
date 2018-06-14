package guerbai.one_to_fifty;

public class IsMatch {

    private static boolean isMatch(String s, String p) {
        if (p.length()==0) {
            return (s.length()==0);
        }
        boolean match = s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length()>=2 && p.charAt(1)=='*') {
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
