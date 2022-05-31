//7. Write a Java program to grade students based on their marks.
package javaBasicsClassOne;

import java.util.Scanner;

public class PracticeSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks here : ");
        int marks = sc.nextInt();
        if(marks>90){
            System.out.print("A+ Grade");
        }else if(marks>80){
            System.out.print("A Grade");
        }else if(marks>70){
            System.out.print("B+ Grade");
        }else if(marks>60){
            System.out.print("B Grade");
        }else{
            System.out.println("C grade");
        }
    }
}
