package guerbai.f351_400;

public class GetSum {

    // http://www.cnblogs.com/grandyang/p/5451942.html
    private static int getSum(int a, int b) {
        return b == 0 ? a : getSum(a^b, (a&b)<<1);
    }
}
