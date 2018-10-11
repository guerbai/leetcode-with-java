package guerbai.f501_550;

public class ReverseStr2 {

    private static String reverseStr(String s, int k) {
        int sLen = s.length();
        int pointer = 0;
        StringBuilder sb = new StringBuilder();
        boolean reverse = true;
        while (sLen - pointer >= k) {
            if (reverse) {
                for (int i=pointer+k-1; i>pointer-1; i--) {
                    sb.append(s.charAt(i));
                }
                reverse = false;
            } else {
                for (int i=pointer; i<pointer+k; i++) {
                    sb.append(s.charAt(i));
                }
                reverse = true;
            }
            pointer += k;
        }
        if (reverse) {
            for (int i=sLen-1; i>pointer-1; i--) {
                sb.append(s.charAt(i));
            }
        } else {
            for (int i=pointer; i<sLen; i++) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(reverseStr(s,2));
    }
}
