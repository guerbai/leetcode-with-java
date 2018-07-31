package guerbai.twofiveone_to_threezerozero;

public class AddDigits {

    private static int addDigits(int num) {
        while (num > 9) {
            int nextNum = 0;
            while (num > 0) {
                nextNum += num % 10;
                num /= 10;
            }
            num = nextNum;
        }
        return num;
    }

    // explain here: https://leetcode.com/problems/add-digits/discuss/68580/
    private static int cleverAddDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}
