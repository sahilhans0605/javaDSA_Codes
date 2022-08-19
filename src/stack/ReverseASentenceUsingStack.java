package stack;
import java.util.Stack;
public class ReverseASentenceUsingStack {

    static void reverseSentence(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String word = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }
            stack.push(word);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        String s = "I love programming very much";
        reverseSentence(s);
    }
}