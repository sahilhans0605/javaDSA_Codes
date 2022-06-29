package mathematicsBasics;

import java.util.Scanner;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    private static int getValueInBase(int n, int b) {
//        Decimal to any base...for example decimal to binary..toh 2 se divide krte jaana tha aur ulta print krna tha
//        100....toh 2 se divide kiya...mtlb base se divide kiya...aur phir bss 10 se multiply krna hota h...
        int p = 1;
        int fValue = 0;
        while (n > 0) {
            int digit = n % b;
            n/=b;
            fValue += digit * p;
            p *= 10;
        }
        return fValue;
    }
}
