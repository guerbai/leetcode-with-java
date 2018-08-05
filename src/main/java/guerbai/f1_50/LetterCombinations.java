package guerbai.f1_50;

import java.util.*;

public class LetterCombinations {

    static Map<Character, List<Character>> m = new HashMap<>();

    static {
        m.put('2', Arrays.asList('a', 'b', 'c'));
        m.put('3', Arrays.asList('d', 'e', 'f'));
        m.put('4', Arrays.asList('g', 'h', 'i'));
        m.put('5', Arrays.asList('j', 'k', 'l'));
        m.put('6', Arrays.asList('m', 'n', 'o'));
        m.put('7', Arrays.asList('p', 'q', 'r', 's'));
        m.put('8', Arrays.asList('t', 'u', 'v'));
        m.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    private static void recursion(String digits, int index, String s, List<String> result) {
        if (index==digits.length()) {
            result.add(s);
            return;
        }
        for (char c: m.get(digits.charAt(index))) {
            recursion(digits, index+1, s+c, result);
        }
    }

    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length()==0) return result;
        recursion(digits, 0, "", result);
        return result;
    }
}
