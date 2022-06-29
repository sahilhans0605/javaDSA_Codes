package mathematicsBasics;

import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int flag = 0;
            int n = sc.nextInt();
            if (n == 1 || n == 0) {
                System.out.println("not prime");
                flag = 1;
                continue;
            }
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    System.out.println("not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime");
            }
        }
    }
}