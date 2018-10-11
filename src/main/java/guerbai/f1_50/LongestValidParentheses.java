package guerbai.f1_50;

import java.util.ArrayList;
import java.util.List;

public class LongestValidParentheses {

    private static int longestValidParentheses(String s) {
        List<Integer> stack = new ArrayList<>(s.length());
        stack.add(-1);
        int len = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || stack.size() == 0) {
                stack.add(i);
            } else {
                stack.remove(stack.size()-1);
                if (stack.size() == 0) {
                    stack.add(i);
                    continue;
                }
                len = Math.max(len, i - stack.get(stack.size()-1));
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }
}
