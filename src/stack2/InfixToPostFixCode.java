package stack2;

import java.util.Stack;

public class InfixToPostFixCode {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }


    static String infixToPostfix(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            char cur = s.charAt(i);
            if(cur == '(') {
                stack.push(cur);
            } else if(cur == ')') {
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else if(isOperator(cur)) {
                while(!stack.isEmpty() &&
                        precedence(cur) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(cur);
            } else {
                sb.append(cur);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }


    private static int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '%') {
            return 2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String input = "(2*3)-(4/5-6+7)";
        String output= infixToPostfix(input);
        System.out.println(output);
    }
}