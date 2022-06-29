package mathematicsBasics;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    private static int getValueIndecimal(int n, int b) {
//        kisi base se decimal mein le jaana h to maano binary number h 110101 isko decimal mein convert kese kru?
//        last se shuru hoke 2^0* + 2^1....toh p*=b
        int power = 1;
        int fValue = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            fValue+=digit*power;
            power=power*b;
        }
        return fValue;
    }

}
