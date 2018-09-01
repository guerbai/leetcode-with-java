package guerbai.f551_600;

import java.util.List;

public class ReverseWords {

    private static String reverseWords(String s) {
        String[] ss = s.split(" ");
        for (int i=0; i<ss.length; i++) {
            ss[i] = new StringBuilder(ss[i]).reverse().toString();
        }
        return String.join(" ", ss);
    }
}
