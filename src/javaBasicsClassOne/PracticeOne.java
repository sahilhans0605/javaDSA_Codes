//1. Write a Java program that takes two numbers as input and display the product of two numbers.
package javaBasicsClassOne;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number : ");
        float b = sc.nextFloat();
        System.out.println("Product of two numbers is : " + a * b);

    }
}
