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

    public static void main(String[] args) {
//        Number is even if n^1==n+1
//        else number is odd...basically even mein last bit 1 hogi and odd mein last bit 0 hogi
        int n = new Scanner(System.in).nextInt();
        if (checkEvenOrOdd(n) == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
