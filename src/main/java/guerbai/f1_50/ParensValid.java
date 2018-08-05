package guerbai.f1_50;

import java.util.ArrayList;
import java.util.List;

public class ParensValid {

    private static boolean match(char r, char l) {
        return (r == '}' && l == '{') || (r == ']' && l == '[') || (r == ')' && l == '(');
    }

    private static boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        String leftParens = "({[";
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (leftParens.indexOf(c)>=0) {
                stack.add(c);
            } else {
                if (stack.size()==0) return false;
                if (!match(c, stack.get(stack.size()-1))) {
                    return false;
                }
                stack.remove(stack.size()-1);
            }
        }
        return stack.size()==0;
    }
}
