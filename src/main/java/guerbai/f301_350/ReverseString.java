package guerbai.f301_350;

public class ReverseString {

    private static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>-1; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
