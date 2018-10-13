package guerbai.f501_550;

public class CheckPerfectNumber {

    private static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int kf = (int) Math.sqrt(num) + 1;
        int result = 1;
        for (int i=2; i<kf; i++) {
            if (num % i == 0) {
                result += i;
                result += num / i;
            }
        }
        return result == num;
    }
}
