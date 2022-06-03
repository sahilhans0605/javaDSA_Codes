//https://www.youtube.com/watch?v=YVpTjZRShqo&list=TLGGRoSYpRPgezMxMjA2MjAyMQ&ab_channel=Pepcoding
package javaBasicsClassTwo;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int fValue = 0;
        int carry = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int d = d1 + d2 + carry;
            carry = d / b;
            d = d % b;
            fValue += d * p;
            p = p * 10;
            n1 /= 10;
            n2 /= 10;
        }
        return fValue;
    }
}
