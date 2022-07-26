package mathematicsBasics;

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

    private static int anyBaseToAnyBase(int n, int sourceBase, int destBase) {
        int cvInDecimal = getValueIndecimal(n, sourceBase);
        int valueInBase = getValueInBase(cvInDecimal, destBase);
        return valueInBase;

    }

    private static int getValueIndecimal(int n, int b) {
//        kisi base se decimal mein le jaana h to maano binary number h 110101 isko decimal mein convert kese kru?
//        last se shuru hoke 2^0* + 2^1....toh p*=b
        int p = 1;//2^0
        int convertedValue = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            convertedValue += digit * p;
            p *= b;
        }
        return convertedValue;
    }

    private static int getValueInBase(int n, int b) {
//        Decimal to any base...for example decimal to binary..toh 2 se divide krte jaana tha aur ulta print krna tha
//        100....toh 2 se divide kiya...mtlb base se divide kiya...aur phir bss 10 se multiply krna hota h...
//
        int convertedValue = 0;
        int p = 1;
        while (n != 0) {
            int digit = n % b;
            convertedValue += digit * p;
            n /= b;
            p *= 10;
        }
        return convertedValue;
    }
}
