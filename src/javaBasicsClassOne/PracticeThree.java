//3. Write a Java program that reads a number in inches, converts it to meters.
package javaBasicsClassOne;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in inches : ");
        float number = sc.nextFloat();

        System.out.println("Number in meters is " + (float)(0.0254 * number));
//        1 inch =2.54cm  and  1 meter = 100 cm
    }
}
