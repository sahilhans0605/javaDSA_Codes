package javaBasicsClassTwo;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[5];
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            sum += numArr[i];
        }
        System.out.println("Sum of array elements entered is : " + sum);
    }
}
