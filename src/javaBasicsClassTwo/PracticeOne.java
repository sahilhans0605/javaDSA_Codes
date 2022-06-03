//1. Write a Java program to find the numbers greater than the average of the numbers of a given array.
package javaBasicsClassTwo;

public class PracticeOne {
    public static void main(String[] arguments) {
        int numArr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        int average;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        average = (sum) / numArr.length;
        System.out.println("Average of numbers : "+average);
        System.out.println("Numbers greater than the average...");
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > average) {
                System.out.print(numArr[i] + " ");
            }
        }
    }
}
