package guerbai.f401_450;

public class CountSegments {

    private static int countSegments(String s) {
        if (s.length() == 0) return 0;
        int result = 0;
        boolean inWordSpace = Character.isLetter(s.charAt(0));
        result = inWordSpace ? result + 1 : result;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != ' ' && !inWordSpace) {
                result++;
                inWordSpace = true;
            } else if (s.charAt(i) == ' ' && inWordSpace) {
                inWordSpace = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "love live! mu'sic forever";
        System.out.println(countSegments(s));
    }
}
