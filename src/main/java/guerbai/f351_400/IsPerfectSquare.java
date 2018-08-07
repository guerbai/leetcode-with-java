package guerbai.f351_400;

import java.util.ArrayList;
import java.util.List;

public class IsPerfectSquare {


    // 该方法会超时.
    private static boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        for (int i=1; num>0; i+=2) {
            num -= i;
        }
        return num == 0;
    }


    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
