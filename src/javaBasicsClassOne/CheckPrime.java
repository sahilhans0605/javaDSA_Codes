package javaBasicsClassOne;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int flag = 1;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    System.out.println("not prime");
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if(flag==1){
                System.out.println("prime");
            }
        }
    }
}
