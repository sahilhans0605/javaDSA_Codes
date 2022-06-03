package javaBasicsClassTwo;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int fValue = 0;
        int p = 1;
        while (n != 0) {
            int digit = n % b;
            n /= b;
            fValue += digit * p;
            p = p * 10;

        }
        return fValue;
    }
}
