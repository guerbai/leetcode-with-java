package guerbai.f201_250;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    List<Integer> man = new ArrayList<>();
    List<Integer> kong = new ArrayList<>();
    int peek;

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (man.isEmpty()) {
            peek = x;
        }
        man.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int result = peek;
        while (!man.isEmpty()) {
            int item = man.remove(man.size()-1);
            if (man.isEmpty()) {
                peek = item;
            } else {
                kong.add(item);
            }
        }
        while (!kong.isEmpty()) {
            int item = kong.remove(kong.size()-1);
            if (man.isEmpty()) {
                peek = item;
            }
            man.add(item);
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        return peek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return man.isEmpty();
    }
}
