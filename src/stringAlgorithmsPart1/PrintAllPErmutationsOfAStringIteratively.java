package stringAlgorithmsPart1;

import java.util.Scanner;

public class PrintAllPErmutationsOfAStringIteratively {

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void solution(String str) {
        int n = str.length();
        int f = factorial(n);

        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int j = sb.length(); j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}

