package stack2;

import java.util.ArrayDeque;

public class ImplementMinStackUsingO1Space {

    class MinStack {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int min = 0;

        void push(int t) {
            if (stack.isEmpty()) {
                min = t;
                stack.push(t);
                return;
            }
            if (t >= min) {
                stack.push(t);
            } else {
                stack.push(2 * t - min);
                min = t;
            }
        }

        int pop() throws Exception {
            if (stack.isEmpty()) throw new Exception("Stack is empty");
            int t = stack.pop();
            if (t >= min) {
                return t;
            } else {
                int ans = min;
                min = 2 * min - t;
                return ans;
            }
        }

        int min() throws Exception {
            if (stack.isEmpty()) throw new Exception("Stack is empty");
            return min;
        }

        int peek() throws Exception {
            if (stack.isEmpty()) throw new Exception("Stack is empty");
            int t = stack.peek();
            if (t >= min) {
                return t;
            } else {
                return min;
            }
        }
    }

    public static void main(String[] args) {

    }
}
