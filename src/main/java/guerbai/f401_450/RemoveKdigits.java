package guerbai.f401_450;

public class RemoveKdigits {

    // solution: https://leetcode.com/problems/remove-k-digits/discuss/88680/My-Easy-Understandable-C%2B%2B-Solution
    private static String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        int keep = num.length() - k;
        for (char c: num.toCharArray()) {
            // 在这个while错犯过错，错写为if；
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length()-1) > c) {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(c);
        }
        sb = new StringBuilder(sb.substring(0, keep));
        int index = 0;
        while (index < sb.length() && sb.charAt(index) == '0') {
            index++;
        }
        return index >= sb.length() ? "0" : sb.substring(index);
    }

    public static void main(String[] args) {
        String s = "1234567890";
        int k = 9;
        System.out.println(removeKdigits(s, k));
    }
}