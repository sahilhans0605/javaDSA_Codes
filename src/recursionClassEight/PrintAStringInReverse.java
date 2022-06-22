package recursionClassEight;

public class PrintAStringInReverse {
// time complexity....so number of words in a number log10n +1..so time complexity is log n
//    or we can say O(stringlength)
    static void printStringInReverse(String s, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(s.charAt(i) + " ");
        printStringInReverse(s, i - 1);
    }

    public static void main(String[] args) {
        String s = "sahil";
        printStringInReverse(s, s.length() - 1);

    }
}
