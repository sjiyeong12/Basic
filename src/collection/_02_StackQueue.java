package collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class _02_StackQueue {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue q = new LinkedList();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);

        q.offer(0);
        q.offer(1);
        q.offer(2);
        System.out.println(q);
        q.poll();
        q.poll();
        q.poll();
        System.out.println(q);
    }
}
