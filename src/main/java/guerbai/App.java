package guerbai;

import java.util.PriorityQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PriorityQueue<Integer> s = new PriorityQueue<>();
        int[] ss = {1, 3, 5};
        for (int i: ss) {
            s.offer(i);
        }
//        System.out.println(s.peek());
        PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> (b[0] - a[0]));
        pqCap.add(new int[]{1, 1});
        pqCap.add(new int[]{2, 2});
        System.out.println(pqCap.poll()[0]);
    }
}
