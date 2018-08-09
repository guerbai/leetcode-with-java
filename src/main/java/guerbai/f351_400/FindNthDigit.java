package guerbai.f351_400;

public class FindNthDigit {

    private static int findNthDigit(int n) {
        int num = 1;
        int from = 0;
        int len = 1;
        String sRes = "";
        while (from < n) {
            sRes = Integer.toString(num);
            len = sRes.length();
            from += len;
            num++;
        }
        return Character.getNumericValue(sRes.charAt(n+len-from-1));
    }

    private static int findCleverWay(int n) {
        if (n < 10) return n;
        int l = 0;
        int nowLen = 1;
        // base会超出int最大值变为负值从而引入错误。
        int base = 9;
        while (l < n) {
            l += nowLen * base;
            base *= 10;
            nowLen++;
        }
        nowLen -= 2;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<nowLen; i++) {
            sb.append('9');
        }
        int base9 = Integer.parseInt(sb.toString());
        int len = Integer.toString(base9 + 1).length();
        int targetValue = (n + 1 - base9) / len + base9;
        int targetIndex = (n - 1 - base9) % len;
        return Character.getNumericValue(Integer.toString(targetValue).charAt(targetIndex));
    }

    // 记一下这精细的操作。
    private static int thirdWay(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
//        System.out.println(findNthDigit(1));
        System.out.println(findCleverWay(1000000000));
    }
}
