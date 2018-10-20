package guerbai.f901_950;

public class SortArrayByParity {

    private static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int index = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] % 2 == 0) {
                result[index] = A[i];
                index++;
            }
        }
        for (int i=0; i<A.length; i++) {
            if (A[i] % 2 == 1) {
                result[index] = A[i];
                index++;
            }
        }
        return result;
    }
}