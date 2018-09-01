package guerbai.f701_750;


public class ToLowerCase {

    private static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i=0; i<sb.length(); i++) {
            if (sb.charAt(i)>='A' && sb.charAt(i)<='Z') {
                char c = sb.charAt(i);
                int n = c+32;
                sb.setCharAt(i, (char)n);
            }
        }
        return sb.toString();
    }
}
