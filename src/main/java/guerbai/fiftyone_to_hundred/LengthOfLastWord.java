package guerbai.fiftyone_to_hundred;

public class LengthOfLastWord {

    private static int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        int result;
        char kong = ' ';
        if (s.charAt(0) == kong) {
            result = 0;
        } else {
            result = 1;
        }
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) != kong && s.charAt(i-1) == kong) {
                result = 1;
            } else if (s.charAt(i) != kong) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }
}
