package bitManipulation;

import java.util.Scanner;

public class CheckIfNumberIsOddOrEven {

    static int checkEvenOrOdd(int n) {
        if ((n ^ 1) == (n + 1)) {
            return 1;
        } else {
            return 0;
        }
    }

    static int checkEvenOrOdd2(int n) {
        if ((n & 1) == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
//        Number is even if n^1==n+1
//        else number is odd...basically even mein last bit 0 hogi and odd mein last bit 1 hogi
        int n = new Scanner(System.in).nextInt();
        if (checkEvenOrOdd(n) == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if (checkEvenOrOdd2(n) == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}