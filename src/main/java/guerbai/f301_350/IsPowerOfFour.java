package guerbai.f301_350;

public class IsPowerOfFour {

    private static boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        while (num % 4 == 0) {
            num /= 4;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
}

