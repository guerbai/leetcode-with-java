package guerbai.f551_600;

import java.util.PriorityQueue;

public class FindMaximizedCapital {

    // https://leetcode.com/problems/ipo/discuss/98210/Very-Simple-(Greedy)-Java-Solution-using-two-PriorityQueues
    // brilliant solution.
    private static int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        int result = W;
        PriorityQueue<Integer[]> pqCap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<Integer> pqPro = new PriorityQueue<>((a, b) -> (b - a));
        for (int i=0; i<Profits.length; i++) {
            pqCap.add(new Integer[]{Capital[i], Profits[i]});
        }
        for (int i=0; i<k; i++) {
            // result不会减少，这个项目做完，下次还能用，下个循环时，会把小于现result的值也加上；
            while (!pqCap.isEmpty() && pqCap.peek()[0] <= result) {
                pqPro.add(pqCap.poll()[1]);
            }
            if (pqPro.isEmpty()) break;
            result += pqPro.poll();
        }
        return result;
    }
}
