//Write a Java program to find the maximum and minimum value of an array.
package javaBasicsClassTwo;

import java.util.Scanner;

public class PracticeFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] > max) {
                max = numArr[i];
            }
            if (numArr[i] < min) {
                min = numArr[i];
            }
        }
        System.out.println("Maximum element is " + max + "\nMinimum element is " + min);

    }
}
