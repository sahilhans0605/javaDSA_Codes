package javaBasicsClassOne;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        System.out.println();...new line
//        System.out.print();...no new line
//        System.out.printf();.....%s,%f....c lang ki tarah
//        System.out.printf("%d",34);
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is : "+age);
        System.out.println("Enter your name: ");
        sc.nextLine();//sc.nextLine() keeps finding for enter as input so we take that input automatically after enter of age
        String name = sc.nextLine();
        System.out.println("Your name is : "+name);
    }
}
