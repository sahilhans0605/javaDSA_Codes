package stringAlgorithmsPart1;

import java.util.Scanner;

public class PrintAllPalindromicStrings {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {//<= because last index is not included
                if (isPalindrome(str.substring(i, j))) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }

    private static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        char ch1 = s.charAt(i);
        char ch2 = s.charAt(j);
        while (i <= j) {
            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
