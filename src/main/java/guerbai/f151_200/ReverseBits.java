package guerbai.f151_200;

public class ReverseBits {

    private static int reverseBits(int n) {
        int maskEnd = 1;
        int maskStart = 0b10000000000000000000000000000000;
        int loc = 0;
        while (loc < 16) {
            int end = (maskEnd & n) == maskEnd ? 1 : 0;
            int start = (maskStart & n) == maskStart ? 1: 0;
            if (end == 1) {
                n = n | maskStart;
            } else {
                n = n & ~(maskStart);
            }
            if (start == 1) {
                n = n | maskEnd;
            } else {
                n = n & ~(maskEnd);
            }
            loc++;
            maskEnd = maskEnd << 1;
            maskStart = maskStart >>> 1;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

}
