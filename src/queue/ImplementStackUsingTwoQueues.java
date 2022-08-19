package queue;
//Time and space complexity both O(n) because we are again and again swapping elements
import stack.ImplementStackUsingArray;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStackUsingTwoQueues {
    Queue<Integer> queue = new LinkedList<>();//O(n)
    Queue<Integer> queue2 = new LinkedList<>();


    void push(int data) {//push terminology for stack
        queue.add(data);
        while (!queue2.isEmpty()) {
            queue.add(queue2.poll());
        }
//        swap
        while (!queue.isEmpty()) {
            queue2.add(queue.poll());
        }
    }

    int pop() {//pop terminology for stack
        if (queue2.isEmpty()) {
            return -1;
        }

        int ans = queue2.poll();

        return ans;
    }

    boolean isEmpty() {
        if (queue2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ImplementStackUsingTwoQueues implementStackUsingQueues = new ImplementStackUsingTwoQueues();
        implementStackUsingQueues.push(1);
        implementStackUsingQueues.push(2);
        implementStackUsingQueues.push(3);
        implementStackUsingQueues.push(4);
        while (!implementStackUsingQueues.isEmpty()) {
            System.out.println(implementStackUsingQueues.pop());
        }
    }
}