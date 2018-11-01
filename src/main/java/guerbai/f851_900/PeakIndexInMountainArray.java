package guerbai.f851_900;

public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int res = -1;
        for (int i=1; i<A.length-1; i++) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                return i;
            }
        }
        return res;
    }
    
}