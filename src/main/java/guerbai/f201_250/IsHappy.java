package guerbai.f201_250;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

    private static int getNextNum(int n) {
        int result = 0;
        while (n > 0) {
            int reminder = n % 10;
            result += reminder * reminder;
            n = n / 10;
        }
        return result;
    }

    private static boolean isHappy(int n) {
        if (n == 1) return true;
        Set<Integer> s = new HashSet<>();
        s.add(n);
        int nextNum = getNextNum(n);
        while (nextNum != 1) {
            if (s.contains(nextNum)) return false;
            s.add(nextNum);
            nextNum = getNextNum(nextNum);
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 19;
        isHappy(a);
    }
}
