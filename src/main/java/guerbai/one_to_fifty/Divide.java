package guerbai.one_to_fifty;

public class Divide {

    private static int divide(int dividend, int divisor) {
        boolean negative = false;
        long dividendL = (long) dividend;
        long divisorL = (long) divisor;
        if ((dividendL < 0 && divisorL > 0) || (dividendL > 0 && divisorL < 0)) {
            negative = true;
        }
        if (dividendL < 0) dividendL = -dividendL;
        if (divisorL < 0) divisorL = -divisorL;
        long result = 0;
        while (dividendL >= divisorL) {
            long innerResult = 1;
            long base = divisorL;
            long nextbase = base << 1;
            while (dividendL >= nextbase) {
                base = nextbase;
                nextbase = base << 1;
                innerResult <<= 1;
            }
            dividendL -= base;
            result += innerResult;
        }
        result = negative ? -result : result;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}
