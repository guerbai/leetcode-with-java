package guerbai.one_to_fifty;

public class StrStr {

    private static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int result = -1;
        for (int i=0, j=0; i<haystack.length()-needle.length()+1; i++) {
            String sub = haystack.substring(i, i+needle.length());
            System.out.println(sub);
            if (sub.equals(needle)) {
                return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String haystack = "mississipi";
        String needle = "pi";
        strStr(haystack, needle);
    }
}
