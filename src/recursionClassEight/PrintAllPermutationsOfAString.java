package recursionClassEight;

//number of permutations is equal to n!
public class PrintAllPermutationsOfAString {

    static void printPermutations(String str, String permutations) {
        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }
        for (int idx = 0; idx < str.length(); idx++) {
            char currChar = str.charAt(idx);
            String leftPartOfChar = str.substring(0, idx);//0-->idx-1
            String rightPartOfChar = str.substring(idx + 1);//idx+1--->length
            String unPermutedString = leftPartOfChar + rightPartOfChar;
            printPermutations(unPermutedString, permutations + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
