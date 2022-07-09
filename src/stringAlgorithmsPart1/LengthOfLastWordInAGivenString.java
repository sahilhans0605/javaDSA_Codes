package stringAlgorithmsPart1;

import java.util.Scanner;

public class LengthOfLastWordInAGivenString {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        char[] c = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < c.length; i++) {
//            System.out.println("entered"+i);

            if (c[i] == ' ') {
                end = i;
                start = i + 1;
            }
        }

        int count = 0;
        for (int i = start; i <= c.length - 1; i++) {
            count++;
        }
        System.out.println(count);

//        Way better and easy
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                len = 0;
            } else {
                len++;
            }
        }
        System.out.println(len);
//3rd approach start from ending
        int len2 = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                System.out.println(len2);
                break;
            } else {
                len2++;
            }
        }

    }

}
