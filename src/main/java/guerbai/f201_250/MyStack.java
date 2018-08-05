package guerbai.f201_250;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int top;

    public MyStack() {
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!q2.isEmpty()) {
            q2.add(x);
        } else {
            q1.add(x);
        }
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> kong;
        Queue<Integer> man;
        int result = top;
        if (q1.isEmpty()) {
            kong = q1;
            man = q2;
        } else {
            kong = q2;
            man = q1;
        }
        while (!man.isEmpty()) {
            int ele = man.poll();
            if (!man.isEmpty()) {
                kong.add(ele);
                top = ele;
            }
        }
        return result;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.top();
        ms.pop();
        ms.top();
    }
}

