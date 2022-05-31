//4. Take three numbers from the user and print the greatest number.
package javaBasicsClassOne;

import java.util.Scanner;

public class PracticeFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b) {
            if (b > c) {
                System.out.println("Greatest number is : " + b);
            } else {
                System.out.println("Greatest number is : " + c);
            }
        } else {
            if (a > c) {
                System.out.println("Greatest number is : " + a);
            } else {
                System.out.println("Greatest number is : " + c);
            }
        }
    }
}
