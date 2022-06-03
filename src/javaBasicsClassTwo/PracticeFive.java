//Write a Java program to separate Os on left side and 1s on right side of an array of Os and 1s in random order.
package javaBasicsClassTwo;

public class PracticeFive {
    public static void main(String[] args) {
        int numArr[] = {1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0};
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            numArr[i] = 0;
        }
        for (int i = count0; i < numArr.length; i++) {
            numArr[i] = 1;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}
