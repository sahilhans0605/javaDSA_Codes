package javaBasicsClassOne;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.print(count);
    }
}
