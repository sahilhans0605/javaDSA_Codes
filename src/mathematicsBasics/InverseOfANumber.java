package mathematicsBasics;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        int invertedNum = 0;
        for (int i = 1; i <= count; i++) {
            int rem = temp % 10;
            invertedNum += i * Math.pow(10, rem - 1);
            temp /= 10;
        }
        System.out.println(invertedNum);
    }
}