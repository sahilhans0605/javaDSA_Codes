package stringAlgorithmsPart1;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "I am the boss";
        String res = reverseWords(s);
        System.out.println(res);
    }

    private static String reverseWords(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                end = i;
                reverseCharacters(c, start, end - 1);
                start = i + 1;
            }
        }
        reverseCharacters(c, start, c.length - 1);
        reverseCharacters(c, 0, c.length - 1);
        return new String(c);
    }

    private static void reverseCharacters(char[] c, int start, int end) {
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
    }
}
