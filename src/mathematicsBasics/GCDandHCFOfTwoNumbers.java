package mathematicsBasics;

import java.util.Scanner;

public class GCDandHCFOfTwoNumbers {
    static int gcdEuclid(int a, int b) {
        if (a < b) {
            return gcdEuclid(b, a);
        }
        if (a == b) {
            return a;
        }
        return gcdEuclid(a - b, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        BRUTE FORCE-----------------------------------------------------------------
//        for (int i = Math.min(a, b); i >= 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                return;
//            }
//        }
//        EUCLID ALGORITHM----------------------------

//        gcd(a, b) = gcd(a - b, b);...where a>b____________________________________
//        Example gcd (36, 24)==gcd(12, 24)--->reverse number a > b...gcd(24, 12) == gcd(12, 0)
        System.out.print(gcdEuclid(a, b));
//        More optimised

    }
}
