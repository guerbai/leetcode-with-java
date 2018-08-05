package guerbai.f301_350;

public class IsPowerOfThree {

    private static boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 3 == 0) {
            if (n == 3) {
                return true;
            }
            return isPowerOfThree(n / 3);
        } else {
            return false;
        }
    }
}
