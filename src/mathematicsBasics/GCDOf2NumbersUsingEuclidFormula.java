package mathematicsBasics;

import java.util.Scanner;

//        first number divide by another until remainder is 0 and return the second number

//O(logn )
public class GCDOf2NumbersUsingEuclidFormula {

    static int bruteForce(int a, int b) {
        int gcd=-1;
        int min = Math.min(a, b);
        for (int i = 1; i <=min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd=i;
            }
        }
        return gcd;
    }

    static int gcdEuclidAlgorithm(int a, int b) {
        if (a % b == 0) {
            return b;
        }//short for gcd(a-b,b);
        int r = a % b;//gcd(a,b)=gcd(b,a%b);//basically we are swapping a and b... so as to keep a>b
        return gcdEuclidAlgorithm(b, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcdEuclidAlgorithm(a, b);
        int gcdb= bruteForce(a,b);
        System.out.println(gcd);
        System.out.println(gcdb);
    }
}
