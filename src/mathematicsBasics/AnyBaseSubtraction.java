package mathematicsBasics;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    private static int getDifference(int b, int n1, int n2) {
        int fValue = 0;
        int p = 1;
        int c = 0;
        int d = 0;
        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            if (d2 <= d1) {
                d = d2 - d1 + b + c;
                c = -1;
            } else {
                d = d2 - d1 + c;
                c = 0;
            }
            fValue += d * p;
            n1 /= 10;
            n2 /= 10;
            p *= 10;
        }
        return fValue;
    }
}
