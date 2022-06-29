package mathematicsBasics;

import java.util.Scanner;

public class GcdAndLCMOfTwoNumbers {
    public static void main(String[] args) {
//        first number divide by another until remainder is 0 and return the second number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int oa = a;
        int ob = b;
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int gcd = b;
        int lcm = (oa * ob)/ gcd;
        System.out.println(gcd);
        System.out.println(lcm);


    }
}
