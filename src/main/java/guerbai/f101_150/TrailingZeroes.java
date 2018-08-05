package guerbai.f101_150;

public class TrailingZeroes {

    private static int trailingZeroes(int n) {
        return n < 5 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

    public static void main(String[] args) {
        trailingZeroes(3);
    }
}
