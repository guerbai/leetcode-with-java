package guerbai.f851_900;

public class IsMonotonic {

    private static boolean isMonotonic(int[] A) {
        if (A.length < 3) {
            return true;
        }
        boolean increase = A[1] > A[0];
        boolean decrease = A[0] > A[1];
        for (int i=2; i<A.length; i++) {
            if (increase && A[i] < A[i-1]) {
                return false;
            } else if (decrease && A[i] > A[i-1]) {
                return false;
            }
            if (A[i] > A[i-1]) {
                increase = true;
            }
            if (A[i] < A[i-1]) {
                decrease = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {2,2,2,1,4,5};
        System.out.print(isMonotonic(A));
    }
}