package queue;

//Time and space complexity both O(n) because we are again and again size-1 elements
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    void push(int data) {//push terminology for stack
        queue.add(data);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.poll());

            size--;
        }
    }

    int pop() {//pop terminology for stack
        if (queue.isEmpty()) {
            return -1;
        }
        int ans = queue.poll();
        return ans;
    }

    boolean isEmpty() {
        return queue.peek()==null;
    }

    public static void main(String[] args) {

        ImplementStackUsingQueue implementStackUsingQueue = new ImplementStackUsingQueue();
        implementStackUsingQueue.push(1);
        implementStackUsingQueue.push(2);
        implementStackUsingQueue.push(3);
        implementStackUsingQueue.push(4);

        while (!implementStackUsingQueue.isEmpty()) {

            System.out.println(implementStackUsingQueue.pop());

        }
    }
}