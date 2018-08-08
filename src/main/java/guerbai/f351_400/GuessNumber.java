package guerbai.f351_400;

public class GuessNumber {

    private static int guess(int num) {
        if (num == 6) {
            return 0;
        } else if (num > 6) {
            return -1;
        } else {
            return 1;
        }
    }

    // 这题巨恶心，首先，是计算mid的方法，可以防止溢出；
    // 还有l，r, 再取值的方式；
    // 一种典型的二分搜索的取值渐近方法，值得记笔记；
    private static int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int guessResult = guess(mid);
            if (guessResult == 0) {
                return mid;
            } else if (guessResult == 1)  {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public int guessNumber2(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
