package stack;

import java.util.Stack;

public class PushAtTheBottomOfTheStack {

    static void pushAtTheBottom(Stack<Integer> s, int k) {
        if (s.isEmpty()) {
            s.push(k);
            return;
        }
        int top = s.pop();
        pushAtTheBottom(s, k);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtTheBottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
