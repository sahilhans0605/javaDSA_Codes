package javaBasicsClassTwo;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int fValue = 0;
        int p = 1;
        while (n != 0) {
            int digit = n % 10;
            fValue += digit * p;
            p = p * b;
            n /= 10;
        }
        return fValue;
    }
}
