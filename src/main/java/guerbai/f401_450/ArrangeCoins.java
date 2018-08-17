package guerbai.f401_450;

public class ArrangeCoins {

    private static int arrangeCoins(int n) {
        long ln = (long) n;
        long result = (long) Math.sqrt(ln * 2) - 1;
        long alreadyUseN = (1 + result) * result / 2;
        while (alreadyUseN + result + 1 <= n) {
            result++;
            alreadyUseN += result;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
