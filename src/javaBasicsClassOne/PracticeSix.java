//6. Write a Java program to swap two numbers.
package javaBasicsClassOne;

import java.util.Scanner;
import java.util.*;

public class PracticeSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.println(a + " " + b);
//        1. Temporary variable
//        System.out.println("After Swapping");
//
//        c = a;
//        a = b;
//        b = c;
//        System.out.println(a + " " + b);

//        2.
//        System.out.println("After Swapping");
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a + " " + b);

//        3.
        System.out.println("After Swapping");
        b = (a + b) - (a = b);
        System.out.println(a + " " + b);
    }
}
