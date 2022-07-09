package stringAlgorithmsPart1;

import java.util.Scanner;

public class PatternMatchingAlgorithmNaive {
//Also check out rabin karp algorithm in this package only for O(n+m)
//Time complexity n*m....s.length*pattern.length
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        String pattern = new Scanner(System.in).next();
//        System.out.println(s.length());
//        System.out.println(pattern.length());
        for (int i = 0; i <= s.length() - pattern.length(); i++) {
            int j = i + 1;
            for (int k = 1; k <= pattern.length(); k++) {
//                System.out.println(i + " " + j);
//                System.out.println(s.substring(i, j) + "  ");

                if (isEqual(s.substring(i, j), pattern)) {
                    System.out.println(i + " ");
                }
                j++;
            }
        }
    }

    private static boolean isEqual(String s, String substring) {
        if (!s.equals(substring)) {
            return false;
        }
        return true;
    }
}

//abcabdabbbdaab