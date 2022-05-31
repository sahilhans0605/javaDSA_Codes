//2. Write a Java program to print the area and perimeter of a circle.
package javaBasicsClassOne;

import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius = sc.nextFloat();
        System.out.println("Area of the circle is : " + (float) Math.PI * radius * radius);
        System.out.println("Perimeter of the circle is : " + (float) Math.PI * 2 * radius);
//        Math.PI --->new thing
    }
}
