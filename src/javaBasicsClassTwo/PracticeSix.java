//Write a Java method to find the smallest number among three numbers.
package javaBasicsClassTwo;

import java.util.Scanner;

public class PracticeSix {
    public static int smallestAmongThree(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int smallest;
        smallest = smallestAmongThree(a, b, c);
        System.out.println("Smallest number is : " + smallest);
    }
}
