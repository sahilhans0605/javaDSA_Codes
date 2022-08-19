package stack2;

import java.util.Stack;

import static stack2.InfixToPostFixCode.isOperator;

public class EvaluationOfPostfixExpression {

    static int postfixEvaluation(String s) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (isOperator(cur)) {
                int second = stack.pop();
                int first = stack.pop();
                int eval = calculate(first, second, cur);
                stack.push(eval);
            } else {
                stack.push(cur - '0');
            }
        }
        return stack.pop();
    }

    static int calculate(int a, int b, char c) {
        int res = 0;
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;//default
    }

    public static void main(String[] args) {

    }
}
