package guerbai.f301_350;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {

    private static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        Set<Character> v = new HashSet<>();
        String yuanyin = "aeiouAEIOU";
        for (int i=0; i<yuanyin.length(); i++) {
            System.out.println(i);
            v.add(yuanyin.charAt(i));
        }
        StringBuilder sb = new StringBuilder(s);
        while (start < end) {
            if (v.contains(sb.charAt(start)) && v.contains(sb.charAt(end))) {
                char c = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, c);
                end--;
                start++;
            } else if (v.contains(sb.charAt(start))) {
                end--;
            } else if (v.contains(sb.charAt(end))) {
                start++;
            } else {
                end--;
                start++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Ui"));
    }
}
