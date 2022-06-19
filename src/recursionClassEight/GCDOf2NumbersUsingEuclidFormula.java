package recursionClassEight;

import java.util.Scanner;

public class GCDOf2NumbersUsingEuclidFormula {
    static int gcdEuclidAlgorithm(int a, int b) {
        if (a % b <= 0) {
            return b;
        }
        int r = a % b;
        return gcdEuclidAlgorithm(b, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcdEuclidAlgorithm(a, b);
        System.out.println(gcd);
    }
}
