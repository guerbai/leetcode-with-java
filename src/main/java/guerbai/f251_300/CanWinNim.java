package guerbai.f251_300;

public class CanWinNim {

    private static boolean canWinNim(int n) {
        // 1,2,3 win, 4 lose, 5,6,7 win, 8 lose;
        return n % 4 != 0;
    }
}
