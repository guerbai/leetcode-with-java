package guerbai.onefiveone_to_twozerozero;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<Integer> cache = new ArrayList<>();
    List<Integer> minCache = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (x < min) min = x;
        cache.add(x);
    }

    public void pop() {
        Boolean refresh = cache.get(cache.size()-1) == min;
        cache.remove(cache.size()-1);
        if (refresh) {
            min = Integer.MAX_VALUE;
            for (int i: cache) {
                if (i < min) {
                    min = i;
                }
            }
        }
    }

    public int top() {
        return cache.get(cache.size()-1);
    }

    public int getMin() {
        return min;
    }
}
