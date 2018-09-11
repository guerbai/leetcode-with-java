package guerbai.f801_850;

public class MaxDistToClosest {

    private static int maxDistToClosest(int[] seats) {
        int maxDistance = 1;
        int lastOneIndex = -1;
        for (int i=0; i<seats.length; i++) {
            if (seats[i] == 1) {
                if (lastOneIndex == -1) {
                    maxDistance = Math.max(i, maxDistance);
                } else if (i - lastOneIndex > maxDistance) {
                    maxDistance = Math.max((i - lastOneIndex) / 2, maxDistance);
                }
                lastOneIndex = i;
            }
            if (i == seats.length - 1) {
                maxDistance = Math.max(i - lastOneIndex, maxDistance);
            }
        }
        return maxDistance;
    }
}
