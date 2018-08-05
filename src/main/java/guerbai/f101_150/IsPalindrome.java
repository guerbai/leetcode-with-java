package guerbai.f101_150;

public class IsPalindrome {

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if (!Character.isLetter(startChar) && !Character.isDigit(startChar)) {
                start++;
            } else if (!Character.isLetter(endChar) && !Character.isDigit(endChar)) {
                end--;
            } else {
                if (startChar != endChar) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab2a";
        System.out.println(isPalindrome(s));
    }
}