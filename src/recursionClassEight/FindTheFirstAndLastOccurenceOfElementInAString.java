package recursionClassEight;
//O(n)...string length n ...traversed once
public class FindTheFirstAndLastOccurenceOfElementInAString {
    public static int first =-1;
    public static int last =-1;

    static void occurenceOfElement(String s, char ele, int i) {
        if (i == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (s.charAt(i) == ele) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        occurenceOfElement(s, ele, i+1);

    }

    public static void main(String[] args) {
        String s = "abaacdaefaah";
        int first = -1;
        int last = -1;
        char ele = 'a';
        int i = 0;
        occurenceOfElement(s, ele, i);

    }
}
