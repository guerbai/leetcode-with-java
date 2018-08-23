package guerbai.f451_500;

public class HammingDistance {

    private static int hammingDistance(int x, int y) {
        int distance = 0;
        int mask = 1;
        for (int i=0; i<32; i++) {
            if (((x&mask)^(y&mask))==mask) {
                distance++;
            }
            mask <<= 1;
        }
        return distance;
    }
}
