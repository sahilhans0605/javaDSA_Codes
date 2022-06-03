//Write a Java method to print Fibonacci series of n terms where n is argument passed by user.
package javaBasicsClassTwo;

import java.util.Scanner;

public class PracticeSeven {
    public static void printFibonacci(int n) {
        int t1 = 0;
        int t2 = 1;
        int t3 = t1 + t2;
        System.out.print(t1 + " ");
        System.out.print(t2 + " ");
        for (int i = 1; i <= n - 2; i++) {
            System.out.print(t3 + " ");
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
