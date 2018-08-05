package guerbai.f1_50;

public class ReverseInt {

    private static int reverse(int x) {
        if (x==0) return 0;
        String s = Integer.toString(x);
        boolean negative = false;
        if (s.charAt(0)=='-') {
            negative = true;
            s = s.substring(1);
        }
        StringBuilder resultStringBuilder = new StringBuilder();
        boolean noZeroOccur = true;
        for (int i=s.length()-1; i>-1; i--) {
            if (!(noZeroOccur && s.charAt(i)=='0')) {
                noZeroOccur = false;
                resultStringBuilder.append(s.charAt(i));
            }
        }
        if (negative) resultStringBuilder.insert(0, '-');
        long result = Long.parseLong(resultStringBuilder.toString());
        if (result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
