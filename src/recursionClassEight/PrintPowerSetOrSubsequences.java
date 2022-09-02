package recursionClassEight;

public class PrintPowerSetOrSubsequences {

    static void printPermutation(String s, String newString) {
        if (s.length() == 0) {
            System.out.println(newString);
        }
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            String roq = s.substring(0, i) + s.substring(i + 1);
            printPermutation(roq,newString+cur);
        }
    }

    public static void main(String[] args) {
        printPermutation("abc", "");
    }
}