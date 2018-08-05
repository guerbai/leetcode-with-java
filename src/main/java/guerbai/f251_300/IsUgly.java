package guerbai.f251_300;

public class IsUgly {

    private static boolean isUgly(int num) {
        if (num == 0) return false;
        while (num % 5 == 0) {
            num /= 5;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        return num == 1;
    }
}
