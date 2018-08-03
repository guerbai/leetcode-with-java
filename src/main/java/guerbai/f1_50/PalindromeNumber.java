package guerbai.f1_50;

public class PalindromeNumber {

    private static boolean isPalindrome(int x) {
        if (x<0) return false;
        String xStr = Integer.toString(x);
        int sLen = xStr.length();
        int l, r;
        if (sLen%2==1) {
            l = sLen/2-1;
            r = sLen/2+1;
        } else {
            l = sLen/2-1;
            r = sLen/2;
        }
        while (l>=0 && r<=sLen-1) {
            if (xStr.charAt(l)!=xStr.charAt(r)) return false;
            l--;
            r++;
        }
        return true;
    }
}
