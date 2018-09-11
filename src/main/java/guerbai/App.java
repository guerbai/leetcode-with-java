package guerbai;

import java.util.Arrays;
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
        System.out.println(s.peek());
    }
}
