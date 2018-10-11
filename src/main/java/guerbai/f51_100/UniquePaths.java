package guerbai.f51_100;

public class UniquePaths {

    // 排列组合题, choose n-1 from  (m+n-2)，用公式算就好;
    private static int uniquePaths(int m, int n) {
        double result = 1;
        if (n < m) return uniquePaths(n, m);
        for (int i=1; i<=m-1; i++) {
            result = result * (n+i-1)/i;
        }
        return (int) result;
    }

    private static int uniquePaths2(int m, int n) {
        int[][] up = new int[m][n];
        for (int i=0; i<m; i++) {
            up[i][0] = 1;
        }
        for (int i=0; i<n; i++) {
            up[0][i] = 1;
        }
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                up[i][j] = up[i-1][j] + up[i][j-1];
            }
        }
        return up[m-1][n-1];
    }

    public static void main(String[] args) {
        uniquePaths(51, 9);
    }
}
