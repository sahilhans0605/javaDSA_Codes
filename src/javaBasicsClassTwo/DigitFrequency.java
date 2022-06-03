//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/digit-frequency-official/ojquestion
package javaBasicsClassTwo;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int countDigit = 0;
        while (n % 10 != 0) {
            if (n % 10 == d) {
                countDigit++;
            }
            n /= 10;
        }
        return countDigit;
    }
}
