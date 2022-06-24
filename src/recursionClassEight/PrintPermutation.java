package recursionClassEight;

public class PrintPermutation {

    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String leftPart = str.substring(0, i);
            String rightPart = str.substring(i + 1);
            String roq = leftPart + rightPart;
            printPermutations(roq, asf + currChar);
        }
    }

    public static void main(String[] args) {
        printPermutations("abc", "");
    }
}