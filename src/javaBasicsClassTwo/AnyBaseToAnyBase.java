package javaBasicsClassTwo;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int d = anyBaseToAnyBase(n, sourceBase, destBase);
        System.out.println(d);
    }

    public static int anyBaseToAnyBase(int n, int sb, int db) {
        int dValue = anyBaseToDecimal(n, sb);
        int fValue = decimalToAnyBase(dValue, db);
        return fValue;
    }

    public static int anyBaseToDecimal(int n, int sb) {
        int fValue = 0;
        int p = 1;
        while (n != 0) {
            int digit = n % 10;
            fValue += digit * p;
            n /= 10;
            p = p * sb;
        }
        return fValue;
    }

    public static int decimalToAnyBase(int n, int db) {

        int fValue = 0;
        int p = 1;
        while (n != 0) {
            int digit = n % db;
            fValue += digit * p;
            n /= db;
            p = p * 10;
        }
        return fValue;
    }

}
