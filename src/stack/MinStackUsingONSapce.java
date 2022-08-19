package stack;

import java.util.Stack;

public class MinStackUsingONSapce {
    public static class MinStack {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        void push(int ele) {
            if (minStack.isEmpty()) {
                minStack.push(ele);//hmmm
            }
            stack.push(ele);

            if (ele <= minStack.peek()) {
                minStack.push(ele);
            }
        }

        int pop() throws Exception {
            if (stack.isEmpty() || minStack.isEmpty()) throw new Exception("Stack is empty");
            int ans = stack.pop();
            if (minStack.peek() == ans) {
                minStack.pop();
            }
            return ans;
        }

        int min() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) throws Exception {
        MinStack minStack = new MinStack();
        minStack.push(10);
        System.out.println(minStack.min());
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.push(5);
        System.out.println(minStack.min());
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(10);


    }
}
