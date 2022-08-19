package stack;

import java.util.Stack;

import static stack.PushAtTheBottomOfTheStack.pushAtTheBottom;

public class ReverseAStackUsingRecursion {

    static void reverseAStack(Stack<Integer> s) {
        if (s.isEmpty()) {
//            s.push(5);
            return;
        }
        int ans = s.pop();
        reverseAStack(s);//har element ko bottom pe daalte jaa rhe hai
        pushAtTheBottom(s, ans);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseAStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
