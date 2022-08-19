package queue;

import java.util.LinkedList;
import java.util.Queue;

//without recursion we can reverse a queue in O(n) space by using Stack
//Time and space both O(n) here because stack is made in recursion
public class ReverseAQueueUsingRecursion {

    static void reverseUsingRecursion(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        int ele = queue.poll();
        reverseUsingRecursion(queue);
        queue.add(ele);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        reverseUsingRecursion(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
