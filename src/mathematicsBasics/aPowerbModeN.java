package mathematicsBasics;

import java.util.Scanner;
//Properties of modulo operator
//  (a+b)%n=(a%n+b%n)%n
//  (a*b)%n=(a%n*b%n)%n
//In some program it is asked to do %n of the final answer so we use this method--->

//Long digits upto 10^18

public class aPowerbModeN {
    static long fastPower(long a, long b, int n) {
        long res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                res = (res % n * a % n) % n;
            }
            a = (a % n * a % n) % n;
            b /= 2;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 1000000007;//10^9+7;
        System.out.print(fastPower(3978432, 5, n));//if we do it directly...in integer type...it will cause memory overflow so we will take a and b as long
    }
}
