package guerbai.f251_300;

public class FirstBadVersion {

    private static boolean isBadVersion(int n) {
        if (n < 5) return true;
        return false;
    }

    private static int recursion(int s, int e) {
        if (s == e) return s;
        if (s + 1 == e) return isBadVersion(s) && !isBadVersion(e) ? s : -1;
        long sl = (long) s;
        long el = (long) e;
        int mid = (int) ((sl + el)/2);
        if (isBadVersion(mid) && !isBadVersion(mid+1)) {
            return mid;
        } else if (isBadVersion(mid) && isBadVersion(mid+1)) {
            return recursion(mid+1, e);
        } else if (!isBadVersion(mid) && !isBadVersion(mid+1)) {
            return recursion(s, mid-1);
        }
        return -1;
    }

    private static int firstBadVersion(int n) {
        for (int i=1; i<n+1; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return -1;
    }

    private static int firstBadVersionBinary(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
