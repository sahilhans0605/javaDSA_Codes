package recursionClassEight;

import java.util.Scanner;

public class KeypadCombinationPepcoding {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    static void keypadCombination(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char currChar = str.charAt(0);
        int currCharNumber= currChar-'0';
        String roq = str.substring(1);

        for (int i = 0; i < codes[currCharNumber].length(); i++) {
            keypadCombination(roq,ans+codes[currCharNumber].charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        keypadCombination(str, "");

    }
}
