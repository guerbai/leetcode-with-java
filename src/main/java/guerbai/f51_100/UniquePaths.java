package guerbai.f51_100;

public class UniquePaths {

    private static int recursion(int m, int n) {return 0;}

    // 排列组合题, choose n-1 from  (m+n-2)，用公式算就好;
    private static int uniquePaths(int m, int n) {
        double result = 1;
        if (n < m) return uniquePaths(n, m);
        for (int i=1; i<=m-1; i++) {
            result = result * (n+i-1)/i;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        uniquePaths(51, 9);
    }
}
