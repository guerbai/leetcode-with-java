package guerbai.onefiveone_to_twozerozero;

public class TitleToNumber {

    private static int titleToNumber(String s) {
        int result = 0;
        for (int i=0; i<s.length(); i++) {
            int innerNumber = s.charAt(i) - 64;
            if (s.length() - 1 - i > 0) {
                result += innerNumber * Math.pow(26,  (s.length() - 1 - i));
            } else {
                result += innerNumber;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "AAA";
        System.out.println(titleToNumber(s));
    }
}
