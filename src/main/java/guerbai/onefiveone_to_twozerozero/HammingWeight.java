package guerbai.onefiveone_to_twozerozero;

public class HammingWeight {

    private static int hammingWeight(int n) {
        int mask = 1;
        int loc = 0;
        int result = 0;
        while (loc < 32) {
            if ((n & mask) == 1) {
                result++;
            }
            n = n >> 1;
            loc++;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.println(hammingWeight(a));
    }
}
