//Write a program to find the factorial value of any number entered through the keyboard.
package javaBasicsClassTwo;

import java.util.Scanner;

public class PracticeEight {
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
    }
}
