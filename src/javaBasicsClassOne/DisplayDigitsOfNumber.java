package javaBasicsClassOne;

import java.util.Scanner;

public class DisplayDigitsOfNumber {
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int count = 0;
        while (m != 0) {
            m /= 10;
            count++;
        }
        int p = (int) Math.pow(10, count - 1);
        while (p != 0) {
            int q = n / p;
            System.out.println(q);
            n = n % p;
            p /= 10;
        }
    }
}
