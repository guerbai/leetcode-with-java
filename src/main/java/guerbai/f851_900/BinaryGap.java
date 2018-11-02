package guerbai.f851_900;

public class BinaryGap {

    public int binaryGap(int N) {
        int mask = 1;
        int lastPosition = -1;
        int maxDistance = 0;
        for (int i=0; i<32; i++) {
            if ((mask & N) == mask) {
                if (i - lastPosition > maxDistance && lastPosition != -1) {
                    maxDistance = i - lastPosition;
                }
                lastPosition  = i;
            }
            mask <<= 1;
        }
        return maxDistance;
    }

}