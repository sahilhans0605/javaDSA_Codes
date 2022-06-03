//Write a Java program that takes a number as input and prints its multiplication table upto 10.
package javaBasicsClassTwo;

import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
