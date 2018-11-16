package guerbai.f901_950;

public class SortArrayByParity2 {

    public int[] sortArrayByParity2(int[] A) {
        int[] result = new int[A.length];
        int ji = 1;
        int oi = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] % 2 == 0) {
                result[oi] = A[i];
                oi += 2;
            } else {
                result[ji] = A[i];
                ji += 2;
            }
        }
        return result;
    }
}