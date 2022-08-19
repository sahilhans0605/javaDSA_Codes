package queue;

import java.util.Stack;

public class QueueUsingTwoStacks {

    class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        int remove() throws Exception {
            if (s1.isEmpty()) {
                throw new Exception("Queue is empty");
            }
            return s1.pop();
        }
        int peek() throws Exception {
            if (s1.isEmpty()) {
                throw new Exception("Queue is empty");
            }
            return s1.peek();
        }


    }

    public static void main(String[] args) {

    }
}
