package mathematicsBasics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        for (int i = 1; i < n; i++) {
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        }
    }
}