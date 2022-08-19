package stack;

import java.util.Stack;

public class DeleteAMiddleElementFromAGivenStack {

    static void deleteMiddleElement(Stack<Integer> stack, int n, int curr) {
        if (stack.isEmpty() && curr == n) {
            return;
        }
        int top = stack.pop();
        deleteMiddleElement(stack, n, curr + 1);
        if ((curr != (n / 2))) {//stack.get(n/2) nhi kr skte kyoki stack empty hai
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        int n = s.size();
        deleteMiddleElement(s, n, 0);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
