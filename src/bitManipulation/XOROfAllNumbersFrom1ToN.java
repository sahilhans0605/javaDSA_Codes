package bitManipulation;

import java.util.Scanner;

public class XOROfAllNumbersFrom1ToN {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res ^= i;
        }
        System.out.println(res);
    }
}
