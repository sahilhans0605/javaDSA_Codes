//5. Write a Java program that takes a year from user and print whether that year is a leap year or not.
package javaBasicsClassOne;

import java.util.Scanner;

public class PracticeFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //    if(((year%4==0) && ((year%400==0) || (year%100!==0))  --->leap year else not a leap year

        if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year ! ");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a leap year ! ");
            } else {
                System.out.println(year + " is not a leap year ! ");
            }
        } else {
            System.out.println(year + " is not a leap year ! ");
        }

    }
}
