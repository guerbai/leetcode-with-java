package guerbai.f801_850;

public class BackspaceCompare {

    private static String type(String T) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (sb.length() == 0) {
                    continue;
                }
                sb.deleteCharAt(sb.length()-1);
            } else {
                sb.append(T.charAt(i));
            }
        }
        return sb.toString();
    }

    private static boolean backspaceCompare(String S, String T) {
        return type(S).equals(type(T));
    }
}
