package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheFirstKElementOfTheQueue {

    static Queue<Integer> reverseTheFirstK(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        if (q.isEmpty() || k <= 0 || k > q.size()) return q;
        for (int i = 1; i <= k; i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }

        for (int i = k + 1; i <= q.size(); i++) {
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        reverseTheFirstK(queue,3);
//        Queue<Integer> qAns = reverseTheFirstK(queue, 3);
        System.out.println(queue);

    }
}
