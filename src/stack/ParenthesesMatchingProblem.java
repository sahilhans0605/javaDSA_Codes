package stack;

import java.util.ArrayDeque;

public class ParenthesesMatchingProblem {

    static boolean parenthesesMatching(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '[' || curr == '{' || curr == '(') {
                stack.push(curr);
                continue;
            }
            if (curr == ')' || curr == '}' || curr == ']') {
                if (stack.isEmpty()) return false;
            }
            char top = 'a';
            switch (curr) {
                case ')':
                    top = stack.pop();
                    if (top != '(') return false;
                    break;
                case '}':
                    top = stack.pop();
                    if (top != '{') return false;
                    break;
                case ']':
                    top = stack.pop();
                    if (top != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();//agr saare elements khaali ho gye honge toh stack empty ho gya hoga
    }

    public static void main(String[] args) {
//        we are given a string
        String s= "()";
        System.out.println(parenthesesMatching(s));
    }
}
